package trilha.back.financys.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaRequestDTO {

    @Column(name = "nameCategoria")
    @NotBlank(message = "O nome é obrigatório!")
    @Size(min = 3,max = 15,message = "O nome deve conter entre 3 a 15 caracteres!")
    private String name;
    @Column(name = "descriptionCategoria")
    @NotBlank(message = "A descrição é obrigatório!")
    @Size(min = 15,max = 50,message = "A descrição deve conter entre 15 a 50 caracteres!")
    private String description;
}
