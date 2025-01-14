package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsPractise {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.testometer.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		TakesScreenshot screenshot =(TakesScreenshot) driver;
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(".//target//DateTimeScr"+dateAndTimeStamp()+ ".png");
		
		FileUtils.copyFile(file, destination);
		
		driver.close();
	}
	
	public static String dateAndTimeStamp()
	{
		return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
		
	}

}
