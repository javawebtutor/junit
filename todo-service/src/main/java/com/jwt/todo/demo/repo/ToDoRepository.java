package com.jwt.todo.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.todo.demo.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
