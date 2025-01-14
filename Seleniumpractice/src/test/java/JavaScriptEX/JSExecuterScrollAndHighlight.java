package JavaScriptEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecuterScrollAndHighlight {
	
	public static void main(String[] args) throws InterruptedException {



		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;

		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();

		WebElement highlight = driver.findElement(By.xpath("//h1[text()='SCROLLING AROUND']"));

		
		jsexecutor.executeScript("arguments[0].scrollIntoViewIfNeeded();", highlight);
		
		jsexecutor.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;')",highlight);
		
				

		TimeUnit.MILLISECONDS.sleep(2000);
	}
}
