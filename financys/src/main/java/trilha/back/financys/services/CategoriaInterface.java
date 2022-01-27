package trilha.back.financys.services;

import trilha.back.financys.dtos.CategoriaRequestDTO;
import trilha.back.financys.dtos.CategoriaResponseDTO;

import java.util.List;

public interface CategoriaInterface {

    CategoriaResponseDTO create(CategoriaRequestDTO body);
    List<CategoriaResponseDTO> readAll();
    CategoriaResponseDTO readById(long id);
    CategoriaResponseDTO update(Long id, CategoriaRequestDTO body);
    void delete(long id);

}
