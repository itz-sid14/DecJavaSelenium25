package FindElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingLinks {
	
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		
		Thread.sleep(5000);
		
		try 
		{
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign-in info.']")).click();
		}
		catch(NoSuchElementException ex) 
		{
			System.out.println("Kuch to gadbad hai Daya....");
		}
		finally
		{
			Thread.sleep(2000);
		}
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement element: links)
		{
			String linkurls = element.getDomAttribute("href");
			
			if(linkurls.startsWith("https://www.booking.com/hotel"));
			{			
				
				System.out.println(linkurls);
			}
		}
		
		driver.close();
	}

}
