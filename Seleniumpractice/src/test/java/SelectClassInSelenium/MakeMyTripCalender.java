package SelectClassInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripCalender {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.get("https://www.makemytrip.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@data-cy='departureDate']"))).click();
		Thread.sleep(3000);

		WebElement NextMonth= driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

		//NextMonth.click();

		WebElement Fetchedmonth = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));
		//System.out.println(Fetchedmonth.getText());
		String ExpectedMonth ="April 2025";
			boolean foundExpectedMonth = false;
			while (!foundExpectedMonth) {
				if (Fetchedmonth.equals(ExpectedMonth)) 
				{
					driver.findElement(By.xpath("(//div[@aria-label='Wed Apr 09 2025'])")).click();
					Thread.sleep(2000);
					//driver.findElement(By.xpath("(//div[@aria-label='Wed Apr 09 2025'])")).click();
					foundExpectedMonth = true;
				} 
				else 
				{
					Thread.sleep(1000);
					NextMonth.click();
				}
			}

			Thread.sleep(2000);

			System.out.println(driver.findElement((By.xpath("//p[@data-cy='departureDate']"))).getText());
			//System.out.println(driver.findElement((By.xpath("//p[@data-cy='returnDate']"))).getText());




		}

	}

