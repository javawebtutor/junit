package com.jwt.todo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.todo.demo.model.ToDo;
import com.jwt.todo.demo.repo.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	ToDoRepository toDoRepository;

	@Override
	public List<ToDo> getAllToDo() {
		List<ToDo> toDos = toDoRepository.findAll();
		return toDos;
	}

	@Override
	public ToDo getToDoById(long id) {
		return toDoRepository.findById(id).get();
	}

	@Override
	public ToDo saveToDo(ToDo todo) {
		return toDoRepository.save(todo);
	}

	@Override
	public void removeToDo(ToDo todo) {
		toDoRepository.delete(todo);

	}

}
