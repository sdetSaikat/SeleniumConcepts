package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By username = By.name("username");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(1))
								.ignoring(NoSuchElementException.class)
								.ignoring(ElementNotInteractableException.class)
								.withMessage("=========Element not found=======");
		
		
		
		
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("S.maity.gcect@gmail.com");
//		String DocumentState = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState=='complete'"))
//				.toString();
//								
//		Boolean.parseBoolean(DocumentState);
//		
		visibilityOfWebElementByFluentWait(username,1,10).sendKeys("Saikat@Jobless");
								
					
		

	}
	
	public static WebElement visibilityOfWebElementByFluentWait(By locator,int pollingTime,int timeOut) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(pollingTime))
			.ignoring(NoSuchElementException.class)
			.ignoring(ElementNotInteractableException.class)
			.withMessage("=========Element not found=======");
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	public static WebElement presenceOfWebElementByFluentWait(By locator,int pollingTime,int timeOut) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(timeOut))
			.pollingEvery(Duration.ofSeconds(pollingTime))
			.ignoring(NoSuchElementException.class)
			.ignoring(ElementNotInteractableException.class)
			.withMessage("=========Element not found=======");
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
