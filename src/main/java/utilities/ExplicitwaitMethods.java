package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitMethods {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		String ParentWindow = driver.getWindowHandle();
		driver.manage().window().fullscreen();
		Actions act = new Actions(driver);
//		act.scrollToElement(driver.findElement(By.xpath("//img[contains(@src,'/footer/facebook')]")));
//		act.sendKeys(Keys.PAGE_DOWN).perform();
		Action action = act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build();
		action.perform();
		
		driver.findElement(By.xpath("//img[contains(@src,'/footer/facebook')]")).click();
		String facebookWindowId=driver.getWindowHandle();
		driver.switchTo().window(ParentWindow);
		
		action.perform();
		Thread.sleep(5);
		driver.findElement(By.xpath("//img[contains(@src,'/footer/linkedin')]")).click();
		String linkWindowId=driver.getWindowHandle();
		driver.switchTo().window(ParentWindow);
		act.perform();
		Thread.sleep(5);
		driver.findElement(By.xpath("//img[contains(@src,'/footer/youtube')]")).click();
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		waitForWindow(4, 5);
		
		
		
		
		
		}
	
	public static boolean waitForWindow(int expectedwindows,int timout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
		return wait.until(ExpectedConditions.numberOfWindowsToBe(expectedwindows));
		
		}
		catch(TimeoutException e) {
			System.out.println("Expected number of window is not correct ");
			return false;
		}
	}
	

	


}
