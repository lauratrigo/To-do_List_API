package projeto_api_lista_de_tarefas.desafio_to_do_list.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    @NotBlank
    private boolean realizado;
    private int prioridade;

    
    public Todo(String nome, String descricao, boolean realizado, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isRealizado() {
        return realizado;
    }
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
