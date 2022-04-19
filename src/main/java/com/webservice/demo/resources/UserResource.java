package com.webservice.demo.resources;

import com.webservice.demo.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"jennifer","jennifer@gmail","24723897283","123");
		return ResponseEntity.ok().body(u);

	}

}
