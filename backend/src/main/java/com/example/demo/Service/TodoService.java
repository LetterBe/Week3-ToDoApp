package com.example.demo.Service;

import com.example.demo.Repository.TodoRepository;
import com.example.demo.TodoTasks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;

    }


    public List<TodoTasks> getTask(){
        return todoRepository.getAllTasks();
    }

    public TodoTasks getTask(String id) {
        return todoRepository.getTaskbyId(id)
                .orElseThrow();

    }

    public void createTask(TodoTasks newTask) {
        todoRepository.createTask(newTask);
    }
}
