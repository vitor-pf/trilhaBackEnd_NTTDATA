package trilha.back.financys.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lancamento")
public class LancamentoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @Column(nullable = false)
    protected String name;
    @Column(nullable = false)
    protected String description;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String amount;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private boolean paid;

    @ManyToOne
    private CategoriaEntity categoryId;

    //Construtor Vazio
    public LancamentoEntity() { }
    //Construtor Completo
    public LancamentoEntity(String name, String description, String type,
                            String amount, String date, boolean paid, CategoriaEntity categoryId) {
        setName(name);
        setDescription(description);
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
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
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public boolean getPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }
    public CategoriaEntity getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(CategoriaEntity categoryId){
        this.categoryId = categoryId;
    }
    @Override
    public String toString(){
        return "Id: "+getId()
                +",\nNome: "+getName()
                +",\nDescription: "+getDescription()
                +",\nType: "+getType()
                +",\nAmount: "+getAmount()
                +",\nDate: "+getDate()
                + ",\nPaid: "+getPaid()
                +",\nCategoryId: "+getCategoryId();
    }
}