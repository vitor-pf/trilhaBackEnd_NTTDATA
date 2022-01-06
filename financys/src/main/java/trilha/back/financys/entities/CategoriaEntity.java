package trilha.back.financys.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categoria")
public class CategoriaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(nullable = false)
    protected String name;
    @Column(nullable = false)
    protected String description;

    //Construtor Vazio
    public CategoriaEntity() { }
    //Construtor Completo
    public CategoriaEntity(Long id, String name, String description) {
        this.id = id;
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

    @OneToMany(mappedBy = "categoryId", orphanRemoval = true, cascade = CascadeType.ALL)
    //@OneToMany
    private List<LancamentoEntity> lancamentoEntity;
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