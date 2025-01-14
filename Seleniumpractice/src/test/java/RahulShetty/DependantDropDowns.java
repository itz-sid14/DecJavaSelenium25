package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependantDropDowns {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@style='border-radius: 14px;']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//p[(text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]"));
		
		from.click();
		
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		
		Thread.sleep(2000);
		
		WebElement To = driver.findElement(By.xpath("//p[(text()='Goa, IN - Dabolim Airport (GOI)')]"));
		
		To.click();
		
		
		driver.close();
		
	}

}
