package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
    @Given("User is on Netbanking login")
    public void user_is_on_netbanking_login() throws Throwable {
       System.out.println("logging in");
    }

    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println("\n");
        System.out.println(strArg2);
    }

    @Then("Home page is landed")
    public void home_page_is_landed() throws Throwable {
       System.out.println("landed");
    }

    @And("Cards are displayed")
    public void cards_are_displayed() throws Throwable {
        System.out.println("displayed");
    }

}