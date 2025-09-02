package com.todo.BootTask01.service;

import com.todo.BootTask01.Entity.Task;
import com.todo.BootTask01.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepo todoRepo;
    public List<Task> allTasks(){
        return todoRepo.getAllTask();
    }
    public Task createTask(Task task) {
        return todoRepo.save(task);
    }
    public Task getById(Integer id){return todoRepo.GetById(id);}
    public void updateTask(Integer id, Task task){todoRepo.updateTask(id,task);}
    public Task setStatus(Integer id, Boolean status){return todoRepo.setStatus(id,status);}
    public void deleteTask(Integer id){todoRepo.deleteTask(id);}
}
