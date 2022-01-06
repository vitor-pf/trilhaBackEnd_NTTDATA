package trilha.back.financys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameCategoria;
    private String descriptionCategoria;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<LancamentoEntity> lancamentoEntity;
}