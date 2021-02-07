package cucumber.uni.finalProject;

import java.util.*;


public class User {

    
    public User() {
    }
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    public Role role;
    public ArrayList<Comment> comments;
    public ArrayList<Topic> topics_Published;
    
    public String getUsername() {
       return this.username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    public String getPassword() {
      return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Comment> getComments() {
        return this.comments;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}