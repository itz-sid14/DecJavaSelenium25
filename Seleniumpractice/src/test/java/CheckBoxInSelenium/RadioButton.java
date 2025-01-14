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

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

		driver.manage().window().maximize();

		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iframeResult")));
		
		driver.switchTo().frame(frame);
		
		WebElement radiobtn = driver.findElement(By.id("css"));
		
		Thread.sleep(2000);

		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", radiobtn);

		wait.until(ExpectedConditions.elementToBeClickable(radiobtn));

		System.out.println(radiobtn.isSelected());

		radiobtn.click();

		//Thread.sleep(5000);

		System.out.println(radiobtn.isSelected());

		//chkBox.click();
		//Thread.sleep(3000);

		driver.close();
	}

}
