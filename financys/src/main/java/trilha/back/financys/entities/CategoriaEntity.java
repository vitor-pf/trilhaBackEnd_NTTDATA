package trilha.back.financys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<LancamentoEntity> lancamentoEntity;

    public CategoriaEntity() { }
    public CategoriaEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonIgnore
    public List<LancamentoEntity> getLancamento() {
        return lancamentoEntity;
    }
    public void setLancamento(List<LancamentoEntity> lancamentoEntity) {
        this.lancamentoEntity = lancamentoEntity;
    }
    @Override
    public String toString(){
        return "Id: "+getId()
                +",\nNome: "+getName()
                +",\nDescription: "+getDescription();
    }
}