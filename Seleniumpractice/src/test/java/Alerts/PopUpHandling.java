package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("cusid"))).sendKeys("Arjun");

		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit"))).click();

		Thread.sleep(3000);

		Alert alert= driver.switchTo().alert();

		System.out.println(alert.getText());

		//alert.dismiss();
		
		alert.accept();

		wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(alert.getText());

		Thread.sleep(3000);

		alert.accept();

		driver.close();



	}

}
