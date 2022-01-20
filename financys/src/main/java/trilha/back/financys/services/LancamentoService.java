package trilha.back.financys.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.ChartDTO;
import trilha.back.financys.dtos.LancamentoRequestDTO;
import trilha.back.financys.dtos.LancamentoResponseDTO;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.exceptions.DivideException;
import trilha.back.financys.exceptions.NotFoundException;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;

import java.util.ArrayList;
import java.util.List;

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

        List<ChartDTO> lists = new ArrayList<ChartDTO>();
        categoriaRepository.findAll()
                .stream()
                .forEach(categoriaEntity -> {
                    ChartDTO chartDTO = new ChartDTO();
                    chartDTO.setName(categoriaEntity.getNameCategoria());
                    chartDTO.setTotal(0.0);
                    categoriaEntity.getLancamentoEntity().forEach(lan -> {
                        chartDTO.setTotal(lan.getAmount() + chartDTO.getTotal());
                    });
                    lists.add(chartDTO);
                });
        return lists;
    }


    private void isCategoryById(Long id) {
        categoriaRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Não existe o id: " + id));
    }

    public LancamentoResponseDTO create(LancamentoRequestDTO body) {
        isCategoryById(body.getCategory().getId());
        return toResponseDTO(lancamentoRepository.save(toEntity(body)));
    }


    public List<LancamentoResponseDTO> readAll(String paid) {
        if (!paid.isEmpty()) {
            return paid.equalsIgnoreCase("pago") || paid.equalsIgnoreCase("pendente")
            ? toListResponseDTO(lancamentoRepository.findByPaid(paid.equalsIgnoreCase("pago")))
            : null;
        }
        return toListResponseDTO(lancamentoRepository.findAll());
    }

    public LancamentoResponseDTO readById(long id) {
        try {
            return toResponseDTO(lancamentoRepository.findById(id).get());
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }

    public LancamentoResponseDTO update(Long id, LancamentoRequestDTO body) {
        try {
            LancamentoEntity result = lancamentoRepository.findById(id).get();
            LancamentoEntity obj = new LancamentoEntity();

            obj.setId(result.getId());
            obj.setName(body.getName());
            obj.setDescription(body.getDescription());
            obj.setType(body.getType());
            obj.setAmount(body.getAmount());
            obj.setDate(body.getDate());
            obj.setPaid(body.isPaid());
            obj.setCategory(body.getCategory());
            return toResponseDTO(lancamentoRepository.save(obj));
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }

    public void deleteById(long id) {
        try {
            lancamentoRepository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }

    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        } catch (ArithmeticException e) {
            throw new DivideException("Erro ao dividir " + x + " por " + y);
        }
    }


    private LancamentoEntity toEntity(LancamentoRequestDTO dto) {
        return modelMapper.map(dto, LancamentoEntity.class);
    }
    private LancamentoResponseDTO toResponseDTO(LancamentoEntity entity) {
        return modelMapper.map(entity, LancamentoResponseDTO.class);
    }
    private List<LancamentoResponseDTO> toListResponseDTO(List<LancamentoEntity> entity) {
        return (List<LancamentoResponseDTO>) modelMapper.map(entity, new TypeToken<List<LancamentoResponseDTO>>(){}.getType());
    }
}