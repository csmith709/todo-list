package com.example.todolist;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {

    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy milk", LocalDate.of(2024, 9, 30));
        todoList.addTask(task);
        assertEquals(1, todoList.getTaskCount());
        assertTrue(todoList.getTasks().contains(task));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        Task task = new Task("Buy milk", LocalDate.of(2024, 9, 30));
        todoList.addTask(task);
        boolean removed = todoList.removeTask(task); // Use Task object
        assertTrue(removed);
        assertEquals(0, todoList.getTaskCount());
    }

    @Test
    public void testGetTaskCount() {
        TodoList todoList = new TodoList();
        Task task1 = new Task("Buy milk", LocalDate.of(2024, 9, 30));
        Task task2 = new Task("Clean house", LocalDate.of(2024, 10, 1));
        todoList.addTask(task1);
        todoList.addTask(task2);
        assertEquals(2, todoList.getTaskCount());
    }
}
