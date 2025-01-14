package RahulShetty;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		JavascriptExecutor js= (JavascriptExecutor) driver; 
		
	WebElement table= 	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='tableFixHead']")));
		
		js.executeScript("arguments[0].scrollIntoViewIfNeeded();",table);
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		
		int sum =0;
		
		for(int i=0; i<values.size();i++)
		{
			sum = sum + Integer.parseInt((values.get(i).getText()));
			
			//System.out.println(sum);
			
		}
		System.out.println("The Total of all values is : "+ sum);
		
		WebElement total= driver.findElement(By.xpath("//div[@class='totalAmount']"));
		
		int totalValue =Integer.parseInt(total.getText().split(":")[1].trim());
		
		//Assert as= new Assert();
		
		Assert.assertEquals(sum, totalValue);
		
		driver.close();
	}

}
