package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/UST")
public class Projectcontroller {
	public String Hello() { 
		
		return "Hi all, Welcome to UST !!";
	}
}
