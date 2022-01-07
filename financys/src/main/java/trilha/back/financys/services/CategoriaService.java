package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.CategoriaDTO;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.repositories.CategoriaRepository;

import java.util.List;
import java.util.Objects;

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
    public CategoriaDTO create(CategoriaEntity body){
        return maptoEntity(categoriaRepository.save(body));
    }
    public List<CategoriaDTO> readAll(){
        return maptoListEntity(categoriaRepository.findAll());
    }
    public CategoriaDTO readById(long id){
        return maptoEntity(categoriaRepository.findById(id).get());
    }
    public CategoriaDTO update(Long id, CategoriaEntity body){
        if (Objects.equals(body.getId(), categoriaRepository.findById(id).get().getId()) ) {
            return maptoEntity(categoriaRepository.save(body));
        }
        return null;
    }
    public void delete(long id){
        categoriaRepository.deleteById(id);
    }

    private CategoriaEntity mapToDto(CategoriaDTO dto) {
        return modelMapper.map(dto, CategoriaEntity.class);
    }
    private CategoriaDTO maptoEntity(CategoriaEntity entity) {
        return modelMapper.map(entity, CategoriaDTO.class);
    }
    private List<CategoriaDTO> maptoListEntity(List<CategoriaEntity> entity) {
        return (List<CategoriaDTO>) modelMapper.map(entity, new TypeToken<List<CategoriaDTO>>(){}.getType());
    }
}