package trilha.back.financys.services;

import trilha.back.financys.dtos.ChartDTO;
import trilha.back.financys.dtos.LancamentoRequestDTO;
import trilha.back.financys.dtos.LancamentoResponseDTO;
import trilha.back.financys.entities.LancamentoEntity;

import java.util.List;

public interface LancamentoInterface {

    LancamentoResponseDTO create(LancamentoRequestDTO body);
    List<LancamentoResponseDTO> readAll(String paid);
    LancamentoResponseDTO readById(long id);
    LancamentoResponseDTO update(Long id, LancamentoRequestDTO body);
    void deleteById(long id);
    List<ChartDTO> grafico();
    Integer calculaMedia(Integer x, Integer y);
    List<LancamentoEntity> getLancamentosDependentes(String date, String amount, boolean paid);

}
