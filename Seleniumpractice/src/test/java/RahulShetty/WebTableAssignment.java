package RahulShetty;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		JavascriptExecutor js= (JavascriptExecutor) driver; 

		WebElement table= 	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@name='courses']")));

		js.executeScript("arguments[0].scrollIntoViewIfNeeded();",table);

		Thread.sleep(3000);

		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']//tr"));

		System.out.println(rows.size());

		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']//th"));

		System.out.println(columns.size());

		System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText());

		driver.close();

	}

}
