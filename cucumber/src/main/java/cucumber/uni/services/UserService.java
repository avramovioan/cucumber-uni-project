package cucumber.uni.services;

import cucumber.uni.finalProject.Role;
import cucumber.uni.finalProject.User;

public class UserService {

	public static User loggedUser = new User();
	
	public static boolean checkUser() {
		if(loggedUser.role == Role.Administrator)
			return true;
		return false;
	}
	
	public static void populateUser(Role role) {
		loggedUser.setEmail("someemail@domain.com");
		loggedUser.setUsername("username");
		loggedUser.setPassword("password");
		loggedUser.setFirstName("UserFirstName");
		loggedUser.setLastName("UserLastName");
		loggedUser.role = role;
	}
	public static User generateUser(Role role, String email, String username, String password) {
		User u = new User();
		u.setEmail(email);
		u.setUsername(username);
		u.setPassword("password");
		u.setFirstName("UserFirstName");
		u.setLastName("UserLastName");
		u.role = role;
		return u;
	}
}
