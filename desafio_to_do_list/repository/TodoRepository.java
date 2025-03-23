package projeto_api_lista_de_tarefas.desafio_to_do_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto_api_lista_de_tarefas.desafio_to_do_list.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
