package trilha.back.financys.services.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dtos.ChartDTO;
import trilha.back.financys.dtos.LancamentoRequestDTO;
import trilha.back.financys.dtos.LancamentoResponseDTO;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.exceptions.DivideException;
import trilha.back.financys.exceptions.NotFoundException;
import trilha.back.financys.exceptions.NotFoundParamException;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;
import trilha.back.financys.services.LancamentoInterface;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;


@Service
public class LancamentoService implements LancamentoInterface {
    @Autowired
    LancamentoRepository lancamentoRepository;
    @Autowired
    CategoriaService categoriaService;
    @Autowired
    CategoriaRepository categoriaRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public LancamentoResponseDTO create(LancamentoRequestDTO body) {
        CategoriaEntity categoria = categoriaRepository.findByName(body.getCategoryName())
                .orElseThrow(()-> new NotFoundException("Não existe a categoria: "+body.getCategoryName()));
        body.setCategory(categoria);
        
        return toResponseDTO(lancamentoRepository.save(toEntity(body)));
    }
    @Override
    public List<LancamentoResponseDTO> readAll(String paid) {
        if (!paid.isEmpty()) {
            return paid.equalsIgnoreCase("pago") || paid.equalsIgnoreCase("pendente")
            ? toListResponseDTO(lancamentoRepository.findByPaid(paid.equalsIgnoreCase("pago")))
            : null;
        }
        return toListResponseDTO(lancamentoRepository.findAll());
    }
    @Override
    public LancamentoResponseDTO readById(long id) {
        try {
            return toResponseDTO(lancamentoRepository.findById(id).get());
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }
    @Override
    public LancamentoResponseDTO update(Long id, LancamentoRequestDTO body) {
        try {
            readById(id);
            CategoriaEntity categoria = categoriaRepository.findByName(body.getCategoryName()).get();
            body.setCategory(categoria);
            body.getType().getType().toUpperCase(Locale.ROOT);
            return toResponseDTO(lancamentoRepository.save(preUpdate(id, body)));

        }catch (EntityNotFoundException e){
            throw new EntityNotFoundException("Não existe o id da categoria: ");
        }catch (NoSuchElementException e){
            throw new NotFoundException("Não existe o id: " + id);
        }
    }
    @Override
    public void deleteById(long id) {
        try {
            readById(id);
            lancamentoRepository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException("Não existe o id: " + id);
        }
    }
    @Override
    public List<ChartDTO> grafico() {
        List<ChartDTO> lists = new ArrayList<ChartDTO>();
        categoriaRepository.findAll()
                .stream()
                .forEach(categoriaEntity -> {
                    ChartDTO chartDTO = new ChartDTO();
                    chartDTO.setName(categoriaEntity.getName());
                    chartDTO.setTotal(0.0);
                    categoriaEntity.getLancamentoEntity().forEach(lan -> {
                        chartDTO.setTotal(lan.getAmount() + chartDTO.getTotal());
                    });
                    lists.add(chartDTO);
                });
        return lists;
    }
    @Override
    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        } catch (ArithmeticException e) {
            throw new DivideException("Erro ao dividir " + x + " por " + y);
        }
    }

    private LancamentoEntity preUpdate(Long id, LancamentoRequestDTO body) {
        LancamentoEntity lancamentoEntity = new LancamentoEntity();
        lancamentoEntity.setId(id);
        lancamentoEntity.setName(body.getName());
        lancamentoEntity.setDescription(body.getDescription());
        lancamentoEntity.setType( body.getType().getType() );
        lancamentoEntity.setAmount(body.getAmount());
        lancamentoEntity.setDate(body.getDate());
        lancamentoEntity.setPaid(body.isPaid());
        lancamentoEntity.setCategory(body.getCategory());
        return lancamentoEntity;
    }
    public List<LancamentoEntity> getLancamentosDependentes(String date, String amount, boolean paid) {
        if (date != null && amount != null) {
            List<LancamentoEntity> result = lancamentoRepository
                    .findAllByDateAndAmountAndPaid(date, Double.parseDouble(amount), paid);
            if (!result.isEmpty())
                return result;
            throw new NotFoundParamException("Não existe os dados pelo parâmetro passado");
        }
        throw new NotFoundException("Parâmetros com valores errados");
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