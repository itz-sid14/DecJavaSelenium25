package BasicsOfSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		//Setup a chrome driver 
		WebDriverManager.chromedriver().setup();
		
		// Diver initialization
		WebDriver driver = new ChromeDriver();
		
		//Launch the browser with url
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://booking.com");
		driver.findElement(By.xpath("//a[@aria-label='Sign in']")).click();
		//a[@aria-label='Sign in']
		//Maximize the window 
		driver.manage().window().maximize();
		
		//Print the title 
		System.out.println(driver.getTitle());
		
		/*
		 * // Finding element by id
		 * driver.findElement(By.id("inputUsername")).sendKeys("Siddharth");
		 * 
		 * // Finding element by name
		 * driver.findElement(By.name("inputPassword")).sendKeys("Sid");
		 * 
		 * // Finding element by class name
		 * driver.findElement(By.className("signInBtn")).click();
		 * 
		 * //TimeUnit.MILLISECONDS.sleep(4000);
		 * 
		 * // Adding Implicit wait
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 * 
		 * // Finding element by CSS Selector
		 * System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		 * 
		 * // Finding element by link text
		 * driver.findElement(By.linkText("Forgot your password?")).click();
		 * 
		 * // Finding element by using XPath
		 * driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(
		 * "Siddharth");
		 * 
		 * 
		 * // Finding element by using Customized css selector
		 * driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys(
		 * "Siddharth12@gmail.com");
		 * 
		 */// Wait for two seconds 
		TimeUnit.MILLISECONDS.sleep(2000);
		
		//Close the browser 
		//driver.close();
		
	}

}
