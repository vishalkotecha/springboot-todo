package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.util.StringResponse;
import com.example.demo.model.TodoModel;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	private TodoService todoService;
	private TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public ResponseEntity<StringResponse> create(TodoModel model) {
		todoService.create(model);
		return ResponseEntity.ok().body(new StringResponse("success"));
	}
	
}
