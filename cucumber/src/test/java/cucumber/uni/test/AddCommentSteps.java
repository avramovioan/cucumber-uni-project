package cucumber.uni.test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.uni.models.TopicScreenModel;

public class AddCommentSteps {
	
	TopicScreenModel topicModel = new TopicScreenModel();
	
	@Given("^The user has opened a topic$")
	public void openTopic()  {
		topicModel.navigateToMe();
	   	}

	@Given("^The user has navigated to the AddComment texbox$")
	public void isInTextBox() {
		topicModel.isInTextBox = true;
	}

	@When("^The \"([^\"]*)\" has been added$")
	public void addText(String text)  {
		topicModel.setText(text);
	}

	@When("^The user clicks on Add Comment button$")
	public void clickAddButton() {
	    topicModel.clickAddButton();
	}

	@Then("^The expected message \"([^\\\"]*)\" shows$")
	public void addCommentToTopicComments(String expectedMessage) {
	    String message = topicModel.addComment();
	    assertEquals(expectedMessage, message);
	}
}
