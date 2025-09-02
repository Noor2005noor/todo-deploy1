package com.todo.BootTask01.controller;

import com.todo.BootTask01.Entity.Task;
import com.todo.BootTask01.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/all")
    public ResponseEntity<List<Task>> getAll() {
        List<Task> tasks = todoService.allTasks();
        return ResponseEntity.ok(tasks);
    }
    @PostMapping("/add")
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        Task t=todoService.createTask(task);
        return ResponseEntity.status(201).body(t);
    }
   @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskbyId(@PathVariable Integer id){
        Task task=todoService.getById(id);
        if(task!=null){
            return ResponseEntity.ok(task);
        }
        else return ResponseEntity.notFound().build();
   }
   @PutMapping("/{id}")
    public void updateTask(@PathVariable Integer id,@RequestBody Task task){
        todoService.updateTask(id,task);

   }
    @PatchMapping("/{id}/status")
    public ResponseEntity<Task> setStatus(@PathVariable Integer id,@RequestBody Boolean status){
       Task t=todoService.setStatus(id,status);
       return ResponseEntity.ok(t);
    }
    @DeleteMapping("/{id}/remove")
    public ResponseEntity<Void> removeTask(@PathVariable Integer id){
        todoService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}

