package ecommerce.app.e.packup.service;

import ecommerce.app.e.packup.model.Todo;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TodoService {
    List<Todo> getTodos();

    Todo getTodoById(Long id);

    Todo insert(Todo todo);

    void updateTodo(Long id, Todo todo);

    void deleteTodo(Long todoId);
}
