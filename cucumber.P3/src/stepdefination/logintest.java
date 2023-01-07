package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logintest 
{
	@Given("Enter Facebook Site url")
	 public void enter_facebook_site_url() 
	{
	    System.out.println("facebook site is opened");
	}
	
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() 
	{
	    System.out.println("vallied password is entered");
	}
	
	@When("click on Login Button")
	public void click_on_login_button() 
	{
	    System.out.println("login sucessfull");
	}
	
	@Then("verify Login successful message")
	public void verify_login_successful_message()
	{
		System.out.println("msg presented");
	}
	
}
