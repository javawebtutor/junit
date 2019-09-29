package com.jwt.todo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jwt.todo.demo.model.ToDo;
import com.jwt.todo.demo.repo.ToDoRepository;

@SpringBootApplication
public class TodoServiceApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(TodoServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodoServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(ToDoRepository toDoRepository) {
		return (args) -> {
			toDoRepository.save(new ToDo("Remove unused imports", true));
			toDoRepository.save(new ToDo("Clean the code", true));
			toDoRepository.save(new ToDo("Build the artifacts", false));
			toDoRepository.save(new ToDo("Deploy the jar file", true));
			logger.info("The sample data has been generated");
		};
	}

}
