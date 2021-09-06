package com.example.demo.user;

import lombok.Data;

@Data
public class user {
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhonenumb() {
		return phonenumb;
	}
	public void setPhonenumb(String phonenumb) {
		this.phonenumb = phonenumb;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String name;
	public String emailid;
	public String phonenumb;
	public String address;
	
	
	
	
	

}
