package com.jwt.todo.demo.service;

import java.util.List;

import com.jwt.todo.demo.model.ToDo;

public interface ToDoService {

	public List<ToDo> getAllToDo();

	public ToDo getToDoById(long id);

	public ToDo saveToDo(ToDo todo);

	public void removeToDo(ToDo todo);

}
