package com.example.demo;

import java.util.List;

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

    }
}
