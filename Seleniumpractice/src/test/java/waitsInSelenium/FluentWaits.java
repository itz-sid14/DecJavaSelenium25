package waitsInSelenium;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		Wait<WebDriver> wait= new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(TimeoutException.class);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@name='btnK'])[2]"))).click();

		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
