package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabKey {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://www.guvi.in/blog/robot-class-in-selenium-webdriver/");

		WebElement input =driver.findElement(By.id("name"));
		
		wait.until(ExpectedConditions.elementToBeClickable(input)).sendKeys("sam");

		Robot events = new Robot();

		events.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		events.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		events.keyPress(KeyEvent.VK_TAB);
		//driver.close();
	}

}
