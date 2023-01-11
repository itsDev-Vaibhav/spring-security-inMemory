package com.practise.vb.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamRestController {
	
	@GetMapping("/")
    public String all(){
        return ("<h1>Welcome All</h1>");
    }
	
	@GetMapping("/user")
	public ResponseEntity<String> getUsers() {
		return new ResponseEntity<String>("This api is authenticated with user Role", HttpStatus.OK);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> getAdmin() {
		return new ResponseEntity<String>("This api is authenticated with ADMIN Role", HttpStatus.OK);
	}

}
