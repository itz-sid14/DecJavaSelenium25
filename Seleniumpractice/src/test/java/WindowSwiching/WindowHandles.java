package WindowSwiching;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();
		
		Set<String> window= driver.getWindowHandles();
		
		Iterator<String> it = window.iterator();
		
		String parent = it.next();
		
		String child = it.next();
		
		driver.switchTo().window(child);
		
		String emailID =driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(emailID);
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("username")).sendKeys(emailID);
		//driver.close();
		
		
		//driver.close();
		
		
		
	}

}
