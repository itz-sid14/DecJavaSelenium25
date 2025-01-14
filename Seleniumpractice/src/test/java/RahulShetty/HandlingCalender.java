package RahulShetty;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalender {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		//		String Date ="6";
		//		String Month="December";
		//		String Year="2026";
		driver.findElement(By.xpath("//a[(text()='Top Deals')]")).click();
		
		Set<String> window= driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		String parent = it.next();

		String child = it.next();

		driver.switchTo().window(child);

		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='----']"))).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();

		 driver.findElement(By.xpath("//button[(text()='2026')]")).click();
		 WebElement Year = driver.findElement(By.xpath("//span[(text()='2026')]"));

//		if(Year.getText().equals("2026"))
//		{
//			System.out.println("Year is correct");
//		}
//		else 
//		{
//			System.out.println("Year is Incorrect");
//		}


		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(11).click();
		
		WebElement Month=driver.findElement(By.xpath("//span[starts-with(text(),'December')]"));

//		if(Month.getText().substring(0,8).equals("December"))
//		{
//			System.out.println("Month is correct");
//		}
//		else 
//		{
//			System.out.println("Month is Incorrect");
//		}

		WebElement Date =driver.findElement(By.xpath("//abbr[(text()='6')]"));
		Date.click();

//		if(Date.getText().equals("6"))
//		{
//			System.out.println("Date is correct");
//			Date.click();
//		}
//		else 
//		{
//			System.out.println("Date is Incorrect");
//		}

		Thread.sleep(3000);
		
	//System.out.println(Date +"/"+Month+"/"+Year);

		List<WebElement> CompleteDate =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		
		//System.out.println(CompleteDate);

	}

}
