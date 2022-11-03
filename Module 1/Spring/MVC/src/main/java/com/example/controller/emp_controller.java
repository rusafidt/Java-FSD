
package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.employee;
import com.example.service.emp_service;

@RestController
public class emp_controller {
	
	@Autowired
	private emp_service emp;

	@PostMapping("/addUser")
	public employee addUser(@RequestBody employee emp) {
		return emp_service.createUser(emp);
	}

	@PostMapping("/addUsers")
	public List<employee> addUsers(@RequestBody List<employee> emp) {
		return emp_service.createUsers(emp);
	}

	@GetMapping("/user/{id}")
	public employee getUserById(@PathVariable long id) {
		return emp_service.getUserById(id);
	}

	@GetMapping("/users")
	public List<employee> getAllUsers() {
		return emp_service.getUsers();
	}
	
	@PutMapping("/updateuser")
	public employee updateUser(@RequestBody employee emp) {
		return emp_service.updateUser(emp);
	}

	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable long id) {
		return emp_service.deleteUserById(id);
	}
}
