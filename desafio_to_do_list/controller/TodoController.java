package projeto_api_lista_de_tarefas.desafio_to_do_list.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import projeto_api_lista_de_tarefas.desafio_to_do_list.entity.Todo;
import projeto_api_lista_de_tarefas.desafio_to_do_list.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create (@RequestBody @Valid Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    List <Todo> list() {
        return todoService.list();
    }

    @PutMapping
    List <Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List <Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
