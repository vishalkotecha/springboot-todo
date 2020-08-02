package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.TodoEntity;
import com.example.demo.model.TodoModel;
import com.example.demo.repository.TodoRepository;

@Service
public class TodoService {
	
	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	public void create(TodoModel model) {
		TodoEntity entity = model.toEntity();
		todoRepository.save(entity);
	}

}

