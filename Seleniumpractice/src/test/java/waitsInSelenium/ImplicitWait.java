package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.co.in/");

		driver.manage().window().maximize();

		WebElement SearchBar = driver.findElement(By.xpath("//textarea[@name='q']"));


		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", SearchBar);

		jsexecutor.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;')",SearchBar);

		jsexecutor.executeScript("arguments[0].value='The no 1 scholar in the world?';",SearchBar);
		
		SearchBar.sendKeys(Keys.ENTER);

		String result = driver.findElement(By.xpath("//div[text()='Dr. Babasaheb Ambedkar']")).getText();

		System.out.println(driver.findElement(By.xpath("//div[text()='Dr. Babasaheb Ambedkar']")).getText());

		driver.close();
	}

}
