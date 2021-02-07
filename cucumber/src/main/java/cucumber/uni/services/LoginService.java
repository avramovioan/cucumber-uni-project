package cucumber.uni.services;

import java.util.ArrayList;

import cucumber.uni.finalProject.Role;
import cucumber.uni.finalProject.User;

public class LoginService {
	
	
	public static String logIn(String username, String password) {
		
		final ArrayList<User> users = getUsers();
		final boolean isUserMatch = users.stream().anyMatch(user -> 
											user.getUsername().equals(username) 
											&& user.getPassword().equals(password));
		return isUserMatch? "Login is successfull" : "Invalid credentials! Please try again.";

	}

	public static ArrayList<User> getUsers(){
		ArrayList<User> users = new ArrayList<User>();
		for(int i = 0; i<3; i++) {
			users.add(UserService.generateUser(Role.Regular, 
											   "somedomain"+i+"@somedomain.com",
											   "username"+i,
											   "password"+i));		
		}
		return users;
	}
}
