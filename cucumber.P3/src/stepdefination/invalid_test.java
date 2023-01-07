package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalid_test 
{
	
		@Given("Outlook Url at chrome")
		public void outlook_url_at_chrome() 
		{
		    System.out.println("outlook site is opend");
		}
		
		@Given("click on SignIn button")
		public void click_on_sign_in_button()
		{
		    System.out.println("signin sucessfull");
		}
		
		@When("User enter valid username")
		public void user_enter_valid_username() 
		{
		    System.out.println("username is opened");
		}
		
		@When("enter invalid password")
		public void enter_invalid_password() 
		{
			System.out.println("invalied password");
		}
		
		@Then("verify error message displayed")
		public void verify_error_message_displayed() 
		{
		   System.out.println("earror msg is display"); 
		}
	
}

