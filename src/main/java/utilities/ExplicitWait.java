package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password= By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
//		waitForElementPresence(email).sendKeys("smaity@gmail.com");
//		driver.findElement(password).sendKeys("Mahadev1234#");
//		waitByClick(login);
		
	
		
	}
	
	public static WebElement waitForElementPresence(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisibility(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void waitByClick(By locator,int timeout) {
		waitForElementVisibility(locator,timeout).click();
	}
	
	public static void waitBySendKeys(By locator,int timeout,CharSequence... value) {
		waitForElementVisibility(locator,timeout).sendKeys(value);
	}
}
