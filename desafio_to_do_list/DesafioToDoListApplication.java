package projeto_api_lista_de_tarefas.desafio_to_do_list;


import projeto_api_lista_de_tarefas.desafio_to_do_list.entity.Todo;
import org.hibernate.annotations.TimeZoneStorage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest(webEnvironment = WebEnviroment.RANDOM_PORT)
class DesafioToDoListApplicationTests {
    @Autowired
    private WebTestClient WebTestClient;
	
	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		WebTestClient
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.length()").isEqualTo(1)
			.jsonPath("$[0].nome()").isEqualTo(todo.getNome())
			.jsonPath("$[0].descricao()").isEqualTo(todo.getDescricao())
			.jsonPath("$[0].realizado()").isEqualTo(todo.isRealizado())
			.jsonPath("$[0].prioridade()").isEqualTo(todo.getPrioridade());
	}

	@Test
	void testCreateTodoFailure() {
		.post()
		.uri("/todos")
		.bodyValue(
			new Todo("", "", false, 0)
		).exchange()
		.expectStatus().isBadRequest();
	}

}