package JavaScriptEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSEScrollAndClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		WebElement SearchBar = driver.findElement(By.xpath("//textarea[@name='q']"));


		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", SearchBar);

		jsexecutor.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;')",SearchBar);
		TimeUnit.MILLISECONDS.sleep(2000);
		
		//jsexecutor.executeScript("arguments[0].click();",SearchBar);
		jsexecutor.executeScript("arguments[0].value='The no 1 scholar in the world?';",SearchBar);
		
		TimeUnit.MILLISECONDS.sleep(2000);
		
		SearchBar.sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.xpath("//div[text()='Dr. Babasaheb Ambedkar']")).getText());

		driver.close();

	}

}
