package trilha.back.financys.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import trilha.back.financys.entities.CategoriaEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LancamentoRequestDTO {
    private Long id;
    private String name;
    private String description;
    private String type;
    private Double amount;
    private String date;
    private boolean paid;
    private CategoriaEntity category;
}
