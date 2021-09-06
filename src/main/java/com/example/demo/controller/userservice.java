package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.function;
import com.example.demo.user.user;

@RestController("/app")
public class userservice {

	@Autowired
	private function abc;

	@GetMapping("/pk")
	public String poke() {

		return "ping";
	}

	@PostMapping("/fetch/userinfo")
	public String gg(@RequestBody user a) {

		return abc.storeuserinfo(a);

	}

}
