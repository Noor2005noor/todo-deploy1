package com.todo.BootTask01.Entity;

public class Task {
    private int id;
    private String taskName;
    private String description;
    private Boolean status;
    Task(){

    }

    public Task(int id, String taskName, String description, Boolean status) {
        this.id = id;
        this.taskName = taskName;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
