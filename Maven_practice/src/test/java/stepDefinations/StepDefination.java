package stepDefinations;



import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
public class StepDefination {
	

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		System.out.println("Navigated to landing page");
		
	}
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		System.out.println("enter username and password");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("home page");
	}
	
	@And("^cards displayed$")
	public void cards_displayed() {
		System.out.println("cards displayed");
	}
	@Given("^User Enters Login Page$")
	public void user_Enters_Login_Page() throws Throwable {
		System.out.println("another feature strts");
	    
	}

	@When("^entering valid credencials\\]$")
	public void entering_valid_credencials() throws Throwable {
	    System.out.println("hi");
	}

	@Then("^Succesfully login(\\d+)$")
	public void succesfully_login(int arg1) throws Throwable {
		System.out.println("hi");   
	}

	@And("^Do whatever u want$")
	public void do_whatever_u_want() throws Throwable {
		System.out.println("another feature ends");
	}


}