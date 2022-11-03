package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.employee;
import com.example.repository.emp_repository;

@Service
public class emp_service {

	@Autowired
	private static emp_repository emprepository;
	
	public static employee createUser(employee emp) {
		return emprepository.save(emp);
	}

	public static List<employee> createUsers(List<employee> emps) {
		// TODO Auto-generated method stub
		return emprepository.saveAll(emps);
	}

	public static employee getUserById(long id) {
		// TODO Auto-generated method stub
		return emprepository.findById(id).orElse(null);
	}

	public static List<employee> getUsers() {
		// TODO Auto-generated method stub
		return emprepository.findAll();
	}

	public static employee updateUser(employee emp) {
		// TODO Auto-generated method stub
		employee oldUser=null;
		Optional<employee> optionaluser=emprepository.findById(emp.getID());
		if(optionaluser.isPresent()) {
			oldUser=optionaluser.get();
			oldUser.setUsername(emp.getUsername());
			oldUser.setAddress(emp.getAddress());
			emprepository.save(oldUser);
		}else {
			return new employee();
		}
		return oldUser;
	}

	public static String deleteUserById(long id) {
	// TODO Auto-generated method stub
		emprepository.deleteById(id);
		return "User got deleted";	}

}
