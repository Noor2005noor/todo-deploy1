package com.todo.BootTask01.repo;

import com.todo.BootTask01.Entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TodoRepo {
private Map<Integer, Task> taskDb=new HashMap<>();
public List<Task> getAllTask()
{
    return new ArrayList<>(taskDb.values());
}
public Task save(Task task){
    taskDb.put(task.getId(),task);
    return task;
}
public Task GetById(Integer id){
    return taskDb.get(id);
}
public void updateTask(Integer id,Task task){
    taskDb.put(id,task);
}public Task setStatus(Integer id,Boolean status){
    Task t=taskDb.get(id);
    t.setStatus(status);
    return t;
}
public void deleteTask(Integer id){
    taskDb.remove(id);
}
}
