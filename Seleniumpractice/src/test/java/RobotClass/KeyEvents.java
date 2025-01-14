package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyEvents {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		WebElement SearchBox =driver.findElement(By.name("q"));

		SearchBox.sendKeys("The Father of the Indian Constituion");

		Robot events = new Robot();

		events.keyPress(KeyEvent.VK_ENTER);


		driver.close();

	}

}
