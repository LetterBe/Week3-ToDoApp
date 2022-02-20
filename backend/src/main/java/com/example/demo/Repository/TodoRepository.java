package com.example.demo.Repository;


import com.example.demo.TodoTasks;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class TodoRepository {

    private final List<TodoTasks> todoTasksArrayList = new ArrayList<>();

    public TodoRepository() {
    }

    public List<TodoTasks> getAllTasks() {
        return todoTasksArrayList;
    }

    public void createTask(TodoTasks newTask) {
        todoTasksArrayList.add(newTask);
    }


    public Optional<TodoTasks> getTaskbyId(String id) {
        for (TodoTasks taskId :todoTasksArrayList) {
            if(taskId.getId()==id){
                return Optional.of(taskId);
            }
        }
        return null;
    }
}

 /*public TodoTasks getTaskbyId(String id) {
        for (TodoTasks taskId : todoTasksArrayList) {
            if (taskId.getId() == id) {
                return taskId;
            }
        }*/
