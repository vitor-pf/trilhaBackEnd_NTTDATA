package trilha.back.financys.services.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.CategoriaRequestDTO;
import trilha.back.financys.dtos.CategoriaResponseDTO;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.exceptions.NotFoundException;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.services.CategoriaInterface;

import java.util.List;


@Service
public class CategoriaService implements CategoriaInterface {
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public CategoriaResponseDTO create(CategoriaRequestDTO body){
        isCategoryByName(body.getName());
        return toResponseDTO(categoriaRepository.save(toEntity(body)));
    }
    @Override
    public List<CategoriaResponseDTO> readAll(){
        return toListResponseDTO(categoriaRepository.findAll());
    }
    @Override
    public CategoriaResponseDTO readById(long id){
        try{
            return toResponseDTO(categoriaRepository.findById(id).get());
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }
    @Override
    public CategoriaResponseDTO update(Long id, CategoriaRequestDTO body){
        try {
            readById(id);
            return toResponseDTO(categoriaRepository.save(preUpdate(id, body)));

        } catch (Exception e){
            throw new NotFoundException("Não existe o id: "+ id);
        }
    }
    @Override
    public void delete(long id){
        try {
            readById(id);
            categoriaRepository.deleteById(id);
        } catch (Exception e){
            throw new NotFoundException("Não existe o id: "+ id);
        }
    }


    private void isCategoryByName(String name){
        if(!categoriaRepository.findByName(name).isEmpty())
            throw new NotFoundException("Já existe: "+ name);
    }
    private CategoriaEntity preUpdate(Long id, CategoriaRequestDTO body) {
        CategoriaEntity categoriaEntity = new CategoriaEntity();
        categoriaEntity.setId(id);
        categoriaEntity.setName(body.getName());
        categoriaEntity.setDescription(body.getDescription());
        return categoriaEntity;
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