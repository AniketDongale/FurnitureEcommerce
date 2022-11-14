package com.furniture.model;

import javax.validation.constraints.*;


public class UserDto {
    @Pattern(regexp="^[A-Za-z]*$",message = "only alphabets")
    @NotBlank(message="username can not be Blank")
    @NotNull(message="username can not be null")
    @Size(max=10,message="username max 10 letters")
    private String username;
    @Size(min=4,message="password should be more then 4 letters")
    private String password;
    @Email(message="Please provide a valid email address")
    private String email;
    private String phone;
    private String name;
    
    

    public UserDto() {
		super();
	}
	public UserDto(
			@Pattern(regexp = "^[A-Za-z]*$", message = "only alphabets") @NotBlank(message = "username can not be Blank") @NotNull(message = "username can not be null") @Size(max = 10, message = "username max 10 letters") String username,
			@Size(min = 4, message = "password should be more then 4 letters") String password,
			@Email(message = "Please provide a valid email address") String email, String phone, String name) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.name = name;
	}
    public UserDto( String username, String password, String email) {
		super();
		
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public User getUserFromDto(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setName(name);

        
        return user;
    }
    
}