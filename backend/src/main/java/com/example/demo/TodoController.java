package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/whattodo")
public class TodoController {

    private List<String> greetings = Arrays.asList("Hallo", "Moin", "Servus");

    private final TodoService todoService ;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(path = "/api/greeting", produces = "text/plain")
    public String hello() {
        Random rand = new Random();
        return greetings.get(rand.nextInt(greetings.size()));
    }

    @GetMapping
    public List<TodoTasks> getTask() {
        return todoService.getTask();
    }

    @GetMapping("/{id}")
    public TodoTasks getTask(@PathVariable String id) {
        return todoService.getTask(id);
    }

    @PutMapping()
    public void createTask(@RequestBody TodoTasks newTask){
        todoService.createTask(newTask);
}







}