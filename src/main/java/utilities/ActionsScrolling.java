package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		act.scrollToElement(driver.findElement(By.linkText("Mobile view"))).pause(200).contextClick().perform();
		

	}

}
