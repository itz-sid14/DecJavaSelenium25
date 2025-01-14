package SelectClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//driver.findElement(By.id("dropdown-checkboxes-radiobuttons")).click();
		
		//driver.getWindowHandle();
		//driver.switchTo().window("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		
		dropdown.click();
		
		Select select = new Select(dropdown);
		
		// Selecting by index
		// select.selectByIndex(3);
		
		// Selecting by visible text 
		//select.selectByVisibleText("Python");

		// Selecting by Value 
		
		select.selectByValue("c#");

		Thread.sleep(2000);
		driver.close();
	}

}
