package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.CategoriaRequestDTO;
import trilha.back.financys.dtos.CategoriaResponseDTO;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.exceptions.NotFoundException;
import trilha.back.financys.repositories.CategoriaRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ModelMapper modelMapper;
    public CategoriaService(CategoriaRepository categoriaRepository, ModelMapper modelMapper) {
        this.categoriaRepository = categoriaRepository;
        this.modelMapper = modelMapper;
    }
    private void isCategoryByName(String name){
        if(!categoriaRepository.findByNameCategoria(name).isEmpty())
            throw new NotFoundException("Já existe: "+ name);
    }
    public CategoriaResponseDTO create(CategoriaRequestDTO body){
        isCategoryByName(body.getNameCategoria());
        return toResponseDTO(categoriaRepository.save(toEntity(body)));
    }
    public List<CategoriaResponseDTO> readAll(){
        return toListResponseDTO(categoriaRepository.findAll());
    }
    public CategoriaResponseDTO readById(long id){
        try{
            return toResponseDTO(categoriaRepository.findById(id).get());
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }
    public CategoriaResponseDTO update(Long id, CategoriaRequestDTO body){
        try {
            CategoriaEntity result = categoriaRepository.findById(id).get();
            CategoriaEntity obj = new CategoriaEntity();

            obj.setId(result.getId());
            obj.setNameCategoria(body.getNameCategoria());
            obj.setDescriptionCategoria(body.getDescriptionCategoria());
            return toResponseDTO(categoriaRepository.save(obj));
        } catch (Exception e){
            throw new NotFoundException("Não existe o id: "+ id);
        }
    }
    public void delete(long id){
        try {
            categoriaRepository.deleteById(id);
        } catch (Exception e){
            throw new NotFoundException("Não existe o id: "+ id);
        }
    }


    private CategoriaEntity toEntity(CategoriaRequestDTO dto) {
        return modelMapper.map(dto, CategoriaEntity.class);
    }
    private CategoriaResponseDTO toResponseDTO(CategoriaEntity entity) {
        return modelMapper.map(entity, CategoriaResponseDTO.class);
    }
    private List<CategoriaResponseDTO> toListResponseDTO(List<CategoriaEntity> entity) {
        return (List<CategoriaResponseDTO>) modelMapper.map(entity, new TypeToken<List<CategoriaResponseDTO>>(){}.getType());
    }
}