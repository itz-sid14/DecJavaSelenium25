package BasicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleExeample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		TimeUnit.MILLISECONDS.sleep(2000);
		
		WebElement SearchBox =driver.findElement(By.name("q"));
		
		SearchBox.sendKeys("Booking.com");
		
		TimeUnit.MILLISECONDS.sleep(2000);
		SearchBox.sendKeys(Keys.ENTER);
		
		TimeUnit.MILLISECONDS.sleep(2000);

		driver.findElement(By.xpath("//span[@data-dtld='booking.com']")).click();
		
		
		
		
	}

}
