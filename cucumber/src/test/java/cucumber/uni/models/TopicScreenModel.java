package cucumber.uni.models;

import cucumber.uni.finalProject.Role;
import cucumber.uni.services.TopicService;
import cucumber.uni.services.UserService;

public class TopicScreenModel {
	
	private String text;
	public boolean isInTextBox = false;
	private boolean isAddButtonClicked = false;
	private boolean isDeleteButtonClicked = false;
	private String message;
	private boolean isAdmin;

	public void navigateToMe() {
		System.out.println("You have now opened this Topic!");
	}

	public void setText(String text) {
		if(isInTextBox)
		this.text = text;
	}

	public void clickAddButton() {
		isAddButtonClicked = true;
	}
	
	public void clickDeleteButton() {
		isDeleteButtonClicked = true;
	}

	public String addComment() {
		return TopicService.addComment(this.text);
	}
	
	public void validateUserAuthorization() {
		isAdmin = UserService.checkUser();
	}
	
	public void deleteComment() {
		if(isDeleteButtonClicked && isAdmin) {
			this.message = TopicService.deleteComment(0);
		}
		else {
			this.message = "Couldn't delete the comment";
		}
	}
	public void deleteTopic() {
		if(isAdmin) {
			this.message = TopicService.deleteTopic(0);
		}
	}
	
	public String getMessage() {
		return message;
	}
}
