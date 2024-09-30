package com.example.todolist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {

    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy milk");
        assertEquals(1, todoList.getTaskCount());
        assertTrue(todoList.getTasks().contains("Buy milk"));
    }

    @Test
    public void testRemoveTask() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy milk");
        boolean removed = todoList.removeTask("Buy milk");
        assertTrue(removed);
        assertEquals(0, todoList.getTaskCount());
    }

    @Test
    public void testGetTaskCount() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy milk");
        todoList.addTask("Clean house");
        assertEquals(2, todoList.getTaskCount());
    }
}
