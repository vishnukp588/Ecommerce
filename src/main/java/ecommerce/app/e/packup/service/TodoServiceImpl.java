package ecommerce.app.e.packup.service;

import ecommerce.app.e.packup.model.Todo;
import ecommerce.app.e.packup.repositary.TodoRepository;
import ecommerce.app.e.packup.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
/**
 * @author vishnu.kp
 */
@Service
public class TodoServiceImpl implements TodoService
{
    @Autowired
    TodoRepository todoRepository;

    @Override
    public List<Todo> getTodos()
    {
        List<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    @Override
    public Todo getTodoById(Long id)
    {
        return todoRepository.findById(id).get();
    }

    @Override
    public Todo insert(Todo todo)
    {
        return todoRepository.save(todo);
    }

    @Override
    public void updateTodo(Long id, Todo todo)
    {
        Todo todoFromDb = todoRepository.findById(id).get();
        System.out.println(todoFromDb.toString());
        todoFromDb.setTodoStatus(todo.getTodoStatus());
        todoFromDb.setDescription(todo.getDescription());
        todoFromDb.setTitle(todo.getTitle());
        todoRepository.save(todoFromDb);
    }

    @Override
    public void deleteTodo(Long todoId)
    {
        todoRepository.deleteById(todoId);
    }
}
