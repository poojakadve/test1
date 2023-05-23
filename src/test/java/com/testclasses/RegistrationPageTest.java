
package com.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.resources.Base;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;

public class RegistrationPageTest extends Base {

	public WebDriver driver;

	private static final Logger logger = LogManager.getLogger(RegistrationPageTest.class);
	//private static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void invokbrowser() throws IOException {

		driver=initializeDriver();//base class
		//log.info("driver is initialized");

		driver.manage().window().maximize();

		//log.info("window is maximized");


	}


	// inheritance
	//by creating object

	@Test(dataProvider="getData")

	public void register(String firstname,String lastname,String email,String mobno,String password,String conpassword) throws IOException, InterruptedException {


		driver.get(prop.getProperty("url"));

		//log.info("navigated to Landing page/Home page or Url is launched");
		LandingPage l =new LandingPage(driver);
		l.signin().click();
		//click on sign in on home page 
		l.CreateAccountTitle().click();

		//log.info("click on sign in tab");
	//	logger.info("click on sign in tab!");


		RegistrationPage r1=new RegistrationPage(driver);

		r1.enterfirstname().sendKeys(firstname);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		r1.enterlastname().sendKeys(lastname);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		r1.enteremail().sendKeys(email);
		r1.enterphone().sendKeys(mobno);
		r1.enterpassword().sendKeys(password);
		r1.enterconpassword().sendKeys(conpassword);
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("befor click on sign in tab!");
		r1.selectcondition().click();
		logger.info("after click on sign in tab!");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r1.submit().click();
		//driver.switchTo().alert();
		
		//log.info("Hello world");  


		//log.info("click on login button");

	}

	@AfterTest
	void tearDown() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][6];
		//0th row
		data[0][0]="pooja";//firstname
		data[0][1]="kadve";//lastname
		data[0][2]="poojakadve@gmail.com";//email
		data[0][3]="9172344483";//mobile no
		data[0][4]="Poojak@23";//pass
		data[0][5]="Poojak@23";//con pass
		

		return data;



	}





}