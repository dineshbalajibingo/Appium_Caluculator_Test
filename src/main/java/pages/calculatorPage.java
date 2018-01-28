package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageObjectLocators.calculatorLocators;

public class calculatorPage {
	
	/* Initializing WebDriver for the App*/
	public WebDriver driver;
	
	/* Mapping the Object locators to the page*/
	@FindBy(xpath =calculatorLocators.numberOne)
	public WebElement one;
	
	@FindBy(id =calculatorLocators.numberTwo)
	public WebElement two;
	
	@FindBy(id =calculatorLocators.plus)
	public WebElement plus;
	
	@FindBy(id =calculatorLocators.equalsTo)
	public WebElement equalsTo;
	
	@FindBy(xpath =calculatorLocators.result)
	public WebElement result;
	
	public calculatorPage(WebDriver dr)
	{
		driver=dr;
	}	
	
	public void clickOne()
	{	
		letsWait();
		one.click();

		letsWait();
	}
	public void clickTwo()
	{
		two.click();
		letsWait();
	}
	public void clickPlus()
	{
		plus.click();
		letsWait();
	}
	public void clickEqualsto()
	{
		equalsTo.click();
		letsWait();
	}
	
	public String readResult()
	{
		String resultNumber = result.getText();
		System.out.println("And the Out Put is " + resultNumber);
		letsWait();
		return resultNumber;
	}
	
	public void letsWait()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
