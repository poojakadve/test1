package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	
	}
	
	
	@FindBy(xpath="//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//*[@id='pass'][@name='login[password]']")
	WebElement passwd;
	
	@FindBy(xpath="//*[@class='action login primary'][@id='send2']") //*[@type='submit'] 
	WebElement signin;
	
	
	public WebElement getLogin(){
		return username;
	}
	
	public WebElement passwd(){
		return passwd;
	}
	public WebElement submit(){
		return signin;
	}
	
	
	 
}