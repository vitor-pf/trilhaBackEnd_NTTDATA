package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.ChartDTO;
import trilha.back.financys.dtos.LancamentoDTO;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ModelMapper modelMapper;
    public LancamentoService(LancamentoRepository lancamentoRepository, ModelMapper modelMapper) {
        this.lancamentoRepository = lancamentoRepository;
        this.modelMapper = modelMapper;
    }
    public List<ChartDTO> grafico() {
        List<ChartDTO> lists= new ArrayList<ChartDTO>();
        categoriaRepository.findAll()
                .stream()
                .forEach(categoriaEntity -> {
                    ChartDTO chartDTO = new ChartDTO();
                    chartDTO.setName(categoriaEntity.getNameCategoria());
                    chartDTO.setTotal(0.0);
                    categoriaEntity.getLancamentoEntity().forEach(lan->{
                        chartDTO.setTotal(lan.getAmount()+chartDTO.getTotal());
                    });
                    lists.add(chartDTO);
                });
        return lists;
    }

    public LancamentoDTO create(LancamentoEntity body){
            return maptoEntity(lancamentoRepository.save(body));
    }

    public List<LancamentoDTO> readAll(){
        return maptoListEntity(lancamentoRepository.findAll());
    }

    public LancamentoDTO readById(long id){
        return maptoEntity(lancamentoRepository.findById(id).get());
    }
    public LancamentoDTO update(Long id, LancamentoEntity body){
        if (Objects.equals(body.getId(), lancamentoRepository.findById(id).get().getId()) ) {
            return maptoEntity(lancamentoRepository.save(body));
        }
        return null;
    }
    public void deleteById(long id){
        lancamentoRepository.deleteById(id);
    }

    private LancamentoEntity mapToDto(LancamentoDTO dto) {
        return modelMapper.map(dto, LancamentoEntity.class);
    }
    private LancamentoDTO maptoEntity(LancamentoEntity entity) {
        return modelMapper.map(entity, LancamentoDTO.class);
    }
    private List<LancamentoDTO> maptoListEntity(List<LancamentoEntity> entity) {
        return (List<LancamentoDTO>) modelMapper.map(entity, new TypeToken<List<LancamentoDTO>>(){}.getType());
    }
}