package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import genericMethods.TestBase;
import pages.calculatorPage;

public class UserStepDefinitions extends TestBase{

	calculatorPage calcPage;

	
	@Before
	public void before()
	{
		try {
			launch();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		calcPage=PageFactory.initElements(driver, calculatorPage.class);
			
		
	}

	@Given("^Open App in phone$")
	public void open_App_in_phone() throws Throwable {
	   System.out.println("App is Opened");
	}

	@Given("^I click on one$")
	public void i_click_on_one() throws Throwable {
		   calcPage.clickOne();
	}

	@Given("^I click on plus$")
	public void i_click_on_plus() throws Throwable {
	 
		  calcPage.clickPlus();
	 }

	@Given("^I click on two$")
	public void i_click_on_two() throws Throwable {
	    calcPage.clickTwo();
	}

	@Given("^I click on equalTo$")
	public void i_click_on_equalTo() throws Throwable {
		calcPage.clickEqualsto();
	}

	@Given("^I validate  addition$")
	public void i_validate_addition() throws Throwable {
		calcPage.readResult();
		assertEquals(calcPage.readResult(), "3");
	}
	
	
}
