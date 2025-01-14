package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();		

		driver.get("https://www.google.co.in/");

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		// By using the current time in millis.
		File tosave = new File(".//target//fileSrcns"+System.currentTimeMillis()+".png");

		FileUtils.copyFile(file, tosave);

		driver.findElement(By.name("q")).sendKeys("Br.Amberdkar"+Keys.ENTER);
		Thread.sleep(2000);

		file = screenshot.getScreenshotAs(OutputType.FILE);
		
		//By using the current date and time.
		tosave = new File(".//target//fileSrcns"+timestamp()+".png");

		FileUtils.copyFile(file, tosave);

		driver.close();
	}

	public static String timestamp() 
	{
		
		return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
	}

}
