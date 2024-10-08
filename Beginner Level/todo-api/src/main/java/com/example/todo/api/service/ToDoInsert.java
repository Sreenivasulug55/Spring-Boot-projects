package com.example.todo.api.service;

import com.example.todo.api.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class ToDoInsert implements CommandLineRunner {
	
	/*
	 * Using Initialize the Values Using  CommandLineRunner 
	 * It Initialize the values in the Server Starting If You Restart the Server All the Changes are Disappear 
	 */

    @Autowired
    ToDoService toDoService;

    @Override
    public void run(String... args) throws Exception {
        toDoService.addTask(new Todo(1, "Complete project proposal", LocalDate.of(2024, 8, 20), false, "High"));
        toDoService.addTask(new Todo(2, "Finish presentation slides", LocalDate.of(2024, 8, 23), false, "Medium"));
        toDoService.addTask(new Todo(3, "Attend team meeting", LocalDate.of(2024, 8, 25), false, "Low"));
        toDoService.addTask(new Todo(4, "Review code changes", LocalDate.of(2024, 8, 27), true, "High"));
        toDoService.addTask(new Todo(5, "Update project timeline", LocalDate.of(2024, 8, 30), false, "Medium"));
        toDoService.addTask(new Todo(6, "Write unit tests",LocalDate.of(2024, 9, 2), false, "High"));


    }
}
