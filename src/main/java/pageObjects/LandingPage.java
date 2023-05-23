
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage{
	WebDriver driver;
	
	public LandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//to declare initialise the web element variAable
	@FindBy(xpath="//*[@class='header links']")
	WebElement signin;
	
	@FindBy(xpath="//span[text()='Register Now']")
	WebElement createAC;
	
	/*@FindBy(xpath="//*[@class='hmsprite logo']")
	WebElement logo;*/
	
	public WebElement signin(){
		return signin;
	}
	
	public WebElement CreateAccountTitle(){
		return createAC;
	}
	
	/*public WebElement ValidateLogo(){
		return logo;
	}*/
}