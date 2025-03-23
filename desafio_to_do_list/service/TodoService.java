package projeto_api_lista_de_tarefas.desafio_to_do_list.service;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import projeto_api_lista_de_tarefas.desafio_to_do_list.entity.Todo;
import projeto_api_lista_de_tarefas.desafio_to_do_list.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;    
   
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridades").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(long id) {
        todoRepository.deleteById(id);;
        return list();
    }
}
