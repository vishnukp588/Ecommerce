/*package ecommerce.app.e.packup;

import ecommerce.app.e.packup.model.Todo;
import ecommerce.app.e.packup.model.TodoStatus;
import ecommerce.app.e.packup.repositary.TodoRepository;
import org.springframework.boot.CommandLineRunner;

public class TodoLoader implements CommandLineRunner {
    public final TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        loadTodos();
    }
    private void loadTodos() {
        if (todoRepository.count() == 0) {
            todoRepository.save(
                    Todo.builder()
                            .title("Go to market")
                            .description("Buy eggs from market")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            todoRepository.save(
                    Todo.builder()
                            .title("Go to school")
                            .description("Complete assignments")
                            .todoStatus(TodoStatus.NOT_COMPLETED)
                            .build()
            );
            System.out.println("Sample Todos Loaded");
        }
    }
}*/
