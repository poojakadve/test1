
package com.testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.resources.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePageTest extends Base {

	public WebDriver driver;


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

	public void logIn(String username,String password,String text) throws IOException, InterruptedException {


		driver.get(prop.getProperty("url"));

		//log.info("navigated to Landing page/Home page or Url is launched");
		LandingPage l =new LandingPage(driver);

		//click on sign in on home page 
		l.signin().click();

		//log.info("click on sign in tab");


		LoginPage l1=new LoginPage(driver);

		l1.getLogin().sendKeys(username);


		l1.passwd().sendKeys(password);

		//log.info(text);

		l1.submit().click();

		//log.info("click on login button");

	}

	@AfterTest
	void tearDown() {

		//driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data=new Object[1][3];
		//0th row
		data[0][0]="pooja.dalvi@payed.in";
		data[0][1]="pooja@23";
		data[0][2]="nonRestrcited User";
		

		return data;



	}





}