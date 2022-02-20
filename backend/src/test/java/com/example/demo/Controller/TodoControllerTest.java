package com.example.demo.Controller;

import com.example.demo.Repository.TodoRepository;
import com.example.demo.TodoTasks;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private TodoRepository todoRepository;


    @Test
    void shouldgetTask() {
        List<TodoTasks> task = List.of(new TodoTasks(), new TodoTasks());
        when(todoRepository.getAllTasks()).thenReturn(task);

        ResponseEntity<TodoTasks[]> response = restTemplate.getForEntity("/whattodo", TodoTasks[].class);
        assertEquals(task, Arrays.stream(response.getBody()).toList());
    }

    @Test
    void shouldGetTaskbyId() {

    }

    @Test
    void shouldCreateTask() {
    }
}