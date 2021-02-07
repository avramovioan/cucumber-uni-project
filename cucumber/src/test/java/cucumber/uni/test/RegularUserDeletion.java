package cucumber.uni.test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.uni.finalProject.Role;
import cucumber.uni.models.TopicScreenModel;
import cucumber.uni.services.UserService;

public class RegularUserDeletion {
	
	TopicScreenModel topicModel = new TopicScreenModel();
	private String message;
	
	@Given("^The Regular user has opened a Topic$")
	public void openTopic() {
		topicModel.navigateToMe();
	}
	
	@Given("^The user has the Regular role$")
	public void checkUserRole() {
		UserService.populateUser(Role.Regular);
		topicModel.validateUserAuthorization();
	}

	@When("^Clicks on the Delete Button next to it$")
	public void clickDeleteButton()  {
		topicModel.clickDeleteButton();
		topicModel.deleteComment();
	}

	@Then("^The expected warning message \"([^\"]*)\" shows$")
	public void displayMessage(String expectedMessage) {
		this.message = topicModel.getMessage();
		assertEquals(expectedMessage, message);
	}
}
