package SelectClassInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowninSel {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", dropdown);
		dropdown.click();
		
		Select select = new Select(dropdown);
		
		// Selecting by index
		// select.selectByIndex(3);
		
		// Selecting by visible text 
		select.selectByVisibleText("Blue");

		// Selecting by Value 
		
		//select.selectByValue("1");
		
	}


}
