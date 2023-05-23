package main.java.resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
			
		
		//browser invoking code
		
		
		public  WebDriver driver;

		public Properties prop;


		public WebDriver initializeDriver() throws IOException  {

			//code for driving value from .propertiesfile

			 prop= new Properties();

			FileInputStream fis= new FileInputStream("C:\\Users\\Payed\\eclipse-workspace\\PayedFramework\\src\\main\\java\\main\\java\\resources\\data.properties");

			prop.load(fis);

			System.out.println(prop.getProperty("browser"));//chrome

			String browserName = prop.getProperty("browser");
			
			if (browserName.equals("chrome")) {


				System.setProperty("webdriver.chrome.driver","D:\\TOOLS\\ChromeDriver\\chromedriver.exe");

				 driver = new ChromeDriver();


			}else if(browserName=="firefox") {


				//firefox code


			} else if(browserName=="IE") {

				//IE code

			}
			return driver;


	}
		

		public void getScreenShotPath1(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;//typecasting 
			File source =ts.getScreenshotAs(OutputType.FILE);//it will take screen shot 
			//create reports1 folder at project level
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			File destination=new File(destinationFile);
			//for fileutils class u need to add dependecy of commans.io
			//FileUtils.copyFile(source,destination);
		

	     FileHandler.copy(source, destination);
	     
		}
}