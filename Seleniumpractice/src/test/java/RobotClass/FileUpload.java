package RobotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://demoqa.com/automation-practice-form");

		
		WebElement input =driver.findElement(By.id("uploadPicture"));
		
		js.executeScript("arguments[0].scrollIntoViewIfNeeded();", input);
		
		wait.until(ExpectedConditions.elementToBeClickable(input));
		
		input.sendKeys("C:\\Users\\Admin\\Downloads\\myphoto.jpg");
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}

}
