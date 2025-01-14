package waitsInSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='btnK'])[2]"))).click();
		
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		/*
		 * WebElement SearchBar = driver.findElement(By.xpath("//textarea[@name='q']"));
		 * 
		 * jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();",
		 * SearchBar);
		 * 
		 * jsexecutor.
		 * executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;')"
		 * ,SearchBar);
		 * 
		 * jsexecutor.
		 * executeScript("arguments[0].value='The no 1 scholar in the world?';"
		 * ,SearchBar);
		 * 
		 * SearchBar.sendKeys(Keys.ENTER);
		 * 
		 * // Use of Explicit wait - until element is present..
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Dr. Babasaheb Ambedkar']")));
		 * 
		 * String result =
		 * driver.findElement(By.xpath("//div[text()='Dr. Babasaheb Ambedkar']")).
		 * getText();
		 * 
		 * System.out.println(driver.findElement(By.
		 * xpath("//div[text()='Dr. Babasaheb Ambedkar']")).getText());
		 */
		driver.close();

	}

}
