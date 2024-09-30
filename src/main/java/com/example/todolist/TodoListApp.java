package com.example.todolist;

import java.time.LocalDate;
import java.util.Scanner;

public class TodoListApp {
    private TodoList todoList;
    private Scanner scanner;

    public TodoListApp() {
        todoList = new TodoList();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Show Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    showTasks();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter due date (YYYY-MM-DD): ");
        LocalDate dueDate = LocalDate.parse(scanner.nextLine());
        Task task = new Task(description, dueDate);
        todoList.addTask(task);
        System.out.println("Task added.");
    }

    private void removeTask() {
        System.out.print("Enter task description to remove: ");
        String description = scanner.nextLine();
        boolean removed = todoList.removeTask(new Task(description, LocalDate.now())); // Dummy due date for removal
        if (removed) {
            System.out.println("Task removed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    private void showTasks() {
        System.out.println("Tasks:");
        for (Task task : todoList.getTasks()) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        TodoListApp app = new TodoListApp();
        app.run();
    }
}
