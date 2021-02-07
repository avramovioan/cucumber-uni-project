package cucumber.uni.test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.uni.finalProject.Role;
import cucumber.uni.models.TopicScreenModel;
import cucumber.uni.services.UserService;

public class DeleteCommentSteps {
	
	private String message;
	private TopicScreenModel topicModel = new TopicScreenModel();
	private boolean isAdmin;
	
	@Given("^The user has opened a Topic$")
	public void openTopic() {
		topicModel.navigateToMe();
	}

	@Given("^The user has the Administrator role$")
	public void checkIfAdministrator() {
		UserService.populateUser(Role.Administrator);
		topicModel.validateUserAuthorization();
	}


	@When("^Clicks on the Delete Button next to a comment$")
	public void buttonClicked() {
		topicModel.clickDeleteButton();
	}

	@Then("^The comment gets deleted$")
	public void deleteComment() {
		topicModel.deleteComment();
	}

	@Then("^the user gets notifed with the \"([^\"]*)\"$")
	public void showMessage(String expectedMessage) {
		this.message = topicModel.getMessage();
		assertEquals(expectedMessage, message);
	}
}
