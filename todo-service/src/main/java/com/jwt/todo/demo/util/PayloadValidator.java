package com.jwt.todo.demo.util;

import com.jwt.todo.demo.model.ToDo;

public class PayloadValidator {

	public static boolean validateCreatePayload(ToDo toDo) {
		if (toDo.getId() > 0) {
			return false;
		}
		return true;
	}

}
