package LogsFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogsInSeleniumJava {

	public static void main(String[] args) {

		

		Logger logger = LogManager.getLogger();

		logger.info("Creating the First Log Session");

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		logger.info("Site is Launched");
		
		
		
		if(driver==null)
		{
			logger.info("Session is in Progress");
		}
		else
		{
			
			logger.warn("Driver is Closed");
		}
		
		driver.close();

	}

}
