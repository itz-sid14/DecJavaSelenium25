package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		Actions action = new Actions(driver);

		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iframeResult")));

		driver.switchTo().frame(frame);
				
		WebElement clickme2ce = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Double-click me']")));
		
		action.doubleClick(clickme2ce).build().perform();
		
		Thread.sleep(3000);

		driver.close();
	}
}
