package RahulShetty;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestiveDropDownAssignment {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//JavascriptExecutor js= (JavascriptExecutor) driver; 
		
	WebElement country= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='autocomplete']")));
		
		
		
		Thread.sleep(2000);
	
	country.sendKeys("ind");
	Thread.sleep(2000);
	country.sendKeys(Keys.DOWN);
	Thread.sleep(1000);
	country.sendKeys(Keys.DOWN);
	Thread.sleep(1000);
	//country.click();
	
	System.out.println(country.getDomAttribute("value"));
	

	driver.close();

	
	
	}

}
