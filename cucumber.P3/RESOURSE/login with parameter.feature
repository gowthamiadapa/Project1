Feature: Verify Flipkart Registration
	Scenario: Registration with mobile number
		Given site url as "http://flipkart.com"
		And click on Register with us
		When user enter valid mobilenumber "82643893682"
		And Enter firstname as "ammulu"
		And Enter Surname as "thalupula"
		And Enter age as 22
		And click on Register
		Then verify Sucessful message