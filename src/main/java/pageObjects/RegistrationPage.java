

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage{
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath="//span[text()='Register Now']")
	//WebElement createAC;
	
	@FindBy(xpath="//*[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='email_address']")
	WebElement email;
	
	@FindBy(xpath="//*[@action='https://www.payed.in/customer/account/createpost/']//*[@title='phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='password-confirmation']")
	WebElement password_confirmation;
	
	@FindBy(xpath="//*[@type='checkbox'][@name='terms_condition']")
	WebElement terms_condition;
	
	
	
	@FindBy(xpath="//*[@type='submit'][@title='Register']") //*[@type='submit'] 
	WebElement register;
	
	public WebElement enterfirstname(){
		return firstname;
	}
	public WebElement enterlastname(){
		return lastname;
	}
	public WebElement enteremail(){
		return email;
	}
	public WebElement enterphone(){
		return phone;
	}
	public WebElement enterpassword(){
		return password;
	}	
	public WebElement enterconpassword(){
		return password_confirmation;
	}
	/*public WebElement selectcondition(){
		return terms_condition;
	}*/
	public void  selectcondition(){
		 terms_condition.click();
	}
	public WebElement submit(){
		return register;
	}
	
	
	/*@FindBy(xpath="//*[@class='hmsprite logo']")
	WebElement logo;*/
	
	
	
	/*public WebElement CreateAccountTitle(){
		return createAC;
	}*/
	
	
	
	/*public WebElement ValidateLogo(){
		return logo;
	}*/
}