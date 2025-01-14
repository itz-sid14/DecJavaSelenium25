package RahulShetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[(text()='Passengers')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"))).click();
		
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText());

		for(int i=1; i<4; i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
