package com.example.demo;

import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoTasks todoTasks = (TodoTasks) o;
        return Objects.equals(id, todoTasks.id) && Objects.equals(task, todoTasks.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, task);
    }
}
