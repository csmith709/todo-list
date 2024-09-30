package com.example.todolist;

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate dueDate;

    public Task(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return name + " (Due: " + dueDate + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        return name.equals(other.name) && dueDate.equals(other.dueDate);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + dueDate.hashCode();
    }
}
