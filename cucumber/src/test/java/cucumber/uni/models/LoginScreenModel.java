package cucumber.uni.models;

import cucumber.uni.services.LoginService;

public class LoginScreenModel {
	
	private String username,password;
	public String message;
	
	public void navigateToMe() {
		System.out.println("Navigated to the login screen");
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login() {
		this.message = LoginService.logIn(this.username, this.password);
	}
}
