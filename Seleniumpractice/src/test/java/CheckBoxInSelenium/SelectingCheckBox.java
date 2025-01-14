package CheckBoxInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingCheckBox {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		Thread.sleep(2000);
		
		WebElement chkBox = driver.findElement(By.xpath("//label[@for='tree-node-documents']//span[@class='rct-checkbox']//*[name()='svg']"));
		
		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", chkBox);
		
		wait.until(ExpectedConditions.elementToBeClickable(chkBox));
		
		System.out.println(chkBox.isSelected());
		
		chkBox.click();
		
		//Thread.sleep(5000);
		
		System.out.println(chkBox.isSelected());
		
		//chkBox.click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
