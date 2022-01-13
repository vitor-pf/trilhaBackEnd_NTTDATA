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
import java.util.NoSuchElementException;
import java.util.Optional;

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
    public List<?> grafico() {
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


    private void isCategoryById(Long id){
        categoriaRepository.findById(id)
                .orElseThrow(()-> new NoSuchElementException("error id: "+ id));
    }
    public LancamentoDTO create(LancamentoEntity body){
        isCategoryById(body.getCategory().getId());
        return maptoEntity(lancamentoRepository.save(body));
    }


    public List<LancamentoDTO> readAll(String paid) {
        if (paid.equals("pago")) {
            return maptoListEntity(lancamentoRepository.findByPaid(true));
        }
        else if (paid.equals("pendente")) {
            return maptoListEntity(lancamentoRepository.findByPaid(false));
        }
        else if(paid.isEmpty()) {
            return maptoListEntity(lancamentoRepository.findAll());
        }else {
            return null;
        }
    }
    public LancamentoDTO readById(long id){
        return maptoEntity(lancamentoRepository.findById(id).get());
    }
    public LancamentoDTO update(Long id, LancamentoEntity body){
        Optional<LancamentoEntity> result = lancamentoRepository.findById(id);
        LancamentoEntity obj = new LancamentoEntity();

        obj.setId(result.get().getId());
        obj.setName(body.getName());
        obj.setDescription(body.getDescription());
        obj.setType(body.getType());
        obj.setAmount(body.getAmount());
        obj.setDate(body.getDate());
        obj.setPaid(body.isPaid());
        obj.setCategory(body.getCategory());
        return maptoEntity(lancamentoRepository.save(obj));
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