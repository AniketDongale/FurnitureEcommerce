package com.furniture.model;

public class JwtAuthenticationResponse {
    private String accessToken;
    private UserInfo user;
    
	public JwtAuthenticationResponse(String accessToken, UserInfo user) {
		super();
		this.accessToken = accessToken;
		this.user = user;
	}
    
}