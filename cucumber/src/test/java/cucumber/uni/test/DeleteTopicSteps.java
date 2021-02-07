package cucumber.uni.test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.uni.finalProject.Role;
import cucumber.uni.models.TopicScreenModel;
import cucumber.uni.services.UserService;

public class DeleteTopicSteps {
	
	TopicScreenModel topicModel = new TopicScreenModel();
	
	@Given("^The user has opened a Topic to be deleted$")
	public void openTopic() {
		topicModel.navigateToMe();
	}
	@Given("^The user has Administrator role$")
	public void checkUserAuthorization() {
	   UserService.populateUser(Role.Administrator);
	   topicModel.validateUserAuthorization();
	}

	@When("^Thse clicks on the Delete Topic button$")
	public void clickDeleteTopicButton() {
		topicModel.deleteTopic();
	}

	@Then("^The expected notificaton \"([^\"]*)\" shows$")
	public void displayNotification(String expectedMessage){
		String message = topicModel.getMessage();
		assertEquals(expectedMessage, message);
	}

}
