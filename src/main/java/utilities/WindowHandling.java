package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial");// parent
		String parentWindowId = driver.getWindowHandle();

		Actions act = new Actions(driver);
		Action action = act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build();
		action.perform();

		WebElement fb_ele = driver.findElement(By.xpath("//img[@alt='facebook']"));
		WebElement li_ele = driver.findElement(By.xpath("//img[@alt='linkedin']"));
		WebElement yt_ele = driver.findElement(By.xpath("//img[@alt='youtube']"));

		fb_ele.click();
		Thread.sleep(15);
		li_ele.click();
		yt_ele.click();

//		driver.findElement(By.xpath("//img[@alt='facebook']")).click();
//		driver.findElement(By.xpath("//img[@alt='linkedin']")).click();
//		driver.findElement(By.xpath("//img[@alt='youtube']")).click();
	}

}
