package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatsappStepDefination {

	// it is created by tidy greken application

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("user_is_on_landing_page");
	}

	@When("^User login into application with user name and password$")
	public void user_login_into_application_with_user_name_and_password() throws Throwable {
			System.out.println("user_login_into_application_with_user_name_and_password");
	}

	@And("^User Able to see the Login user Account$")
	public void user_able_to_see_the_login_user_account() throws Throwable {
		System.out.println("user_able_to_see_the_login_user_account");
	}

	@Then("^User able to enter the user details$")
	public void user_able_to_enter_the_user_details() throws Throwable {
	}

	@But("^Pop menu is not Dispalyed$")
	public void pop_menu_is_not_dispalyed() throws Throwable {
	System.out.println("pop_menu_is_not_dispalyed");
	}

}
