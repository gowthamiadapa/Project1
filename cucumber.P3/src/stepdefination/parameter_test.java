package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parameter_test 
{
	@Given("site url as {string}")
	public void site_url_as(String string) 
	{
	    System.out.println("url is opened");	    
	}
	
	@Given("click on Register with us")
	public void click_on_register_with_us()
	{
	    System.out.println("register is sucessfull");
	}
	
	@When("user enter valid mobilenumber {string}")
	public void user_enter_valid_mobilenumber(String string)
	{
	    System.out.println("82643893682");
	}
	
	@When("Enter firstname as {string}")
	public void enter_firstname_as(String string)
	{
	   System.out.println("ammulu"); 
	}
	
	@When("Enter Surname as {string}")
	public void enter_surname_as(String string)
	{
	   System.out.println("thalupula"); 
	}
	
	@When("Enter age as {int}")
	public void enter_age_as(Integer int1)
	{
	    System.out.println(22);
	}
	
	@When("click on Register")
	public void click_on_register() 
	{
	    System.out.println("register sucessfull");
	}
	@Then("verify Sucessful message")
	public void verify_sucessful_message() 
	{
	    System.out.println("message is verified");
	}

}
