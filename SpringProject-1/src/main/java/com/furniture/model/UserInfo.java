package com.furniture.model;


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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
    

}