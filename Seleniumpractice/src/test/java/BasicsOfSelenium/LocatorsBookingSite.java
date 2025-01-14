package BasicsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsBookingSite {

	public static void main(String[] args) throws InterruptedException {
		//Setup a chrome driver 
		WebDriverManager.chromedriver().setup();

		// Diver initialization
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.google.co.in/");



		//Maximize the window 
		driver.manage().window().maximize();

		//Print the title 
		System.out.println(driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Gmail");
	}
}

