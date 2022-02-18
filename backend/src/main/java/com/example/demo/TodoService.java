package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
