package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotByDateAndTime {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		TakesScreenshot scr = (TakesScreenshot) driver;

		File file =scr.getScreenshotAs(OutputType.FILE);
		
		File saveScreenshot = new File(".//target//DateTimeScr//Screenshot_"+dateTime()+".png");
		
		FileUtils.copyFile(file, saveScreenshot);
		
		driver.close();


	}
	
	public static String dateTime()
	{
		return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
	}

}
