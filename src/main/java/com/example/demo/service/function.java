package com.example.demo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.demo.user.user;

@Service
public class function {
	


	HashMap<String, user> a = new HashMap<>();
	
	 public String storeuserinfo(user u) {
		
		String emailid = u.getEmailid();
		if(a.containsKey(emailid)) {
			
			return "user is existed";
		}
		else {
			
			a.put(emailid, u);
			return "user added ";
		}

		
	}
	 
	 public user storeuserinfo(String emailid) {
		 
		 if(a.containsKey(emailid)) 
			 
			return a.get("emailid");
			
		 return null;
	
	 }

}
