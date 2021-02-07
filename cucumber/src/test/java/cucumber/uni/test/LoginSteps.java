package cucumber.uni.test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.uni.models.LoginScreenModel;

public class LoginSteps {
	
	private LoginScreenModel loginModel = new LoginScreenModel();
	
	@Given("^The user opens login screen$")
	public void openLoginScreen(){
		loginModel.navigateToMe();
	}

	@When("^The user enters \"([^\"]*)\"$")
	public void setUsername(String username) {
		loginModel.setUsername(username);
	}

	@When("^The user enters incorrect \"([^\"]*)\"$")
	public void setPassword(String password) {
		loginModel.setPassword(password);
	}

	@When("^clicks on Login button$")
	public void clickLoginButton(){
		loginModel.login();
	}

	@Then("^The expected validation message \"([^\"]*)\" shows$")
	public void showValidationMessage(String expectedMessage) {
		 String message = loginModel.message;
		 assertEquals(expectedMessage, message);
	}
}
