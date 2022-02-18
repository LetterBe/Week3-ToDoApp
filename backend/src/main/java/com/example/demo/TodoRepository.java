package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TodoRepository {

        private final List<TodoTasks> todoTasksArrayList = new ArrayList<>();

        public List<TodoTasks> getAllTasks(){
            return todoTasksArrayList;
        }

        public void createTask(TodoTasks task){
            todoTasksArrayList.add(task);
        }

    public Optional<TodoTasks> getTaskbyId(String id) {
            return todoTasksArrayList
            for ()
    }
}
