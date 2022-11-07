package com.shoping.Entity;


import java.util.List;


public class UserInfo {
    private String id, username, email;
    private List<String> roles;
    private Cart cart;
    
	public UserInfo(String id, String username, String email, List<String> roles, Cart cart) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.cart = cart;
	}
    
    

}