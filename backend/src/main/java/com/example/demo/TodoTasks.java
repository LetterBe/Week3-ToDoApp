package com.example.demo;

import java.util.UUID;

public class TodoTasks {

    private final String id;
    private String task;

    public TodoTasks() {
        this.id= UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
