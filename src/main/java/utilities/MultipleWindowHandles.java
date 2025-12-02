package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		String ParentWindowId=driver.getWindowHandle();
		System.out.println(ParentWindowId);
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		WebElement fb =driver.findElement(By.xpath("//img[@alt='facebook']"));
		WebElement lnk =driver.findElement(By.xpath("(//img[@alt='linkedin'])[1]"));
		WebElement yt =driver.findElement(By.xpath("(//img[@alt='linkedin'])[2]"));
		WebElement ins =driver.findElement(By.xpath("(//img[@alt='linkedin'])[3]"));
		WebElement twit =driver.findElement(By.xpath("//img[@alt='youtube']"));
		
		act.scrollToElement(fb).build().perform();
		
		fb.click();
		lnk.click();
		yt.click();
		ins.click();
		twit.click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		
		
		for(String s: windowHandles) {
			
			if (!s.equals(ParentWindowId)) {
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(ParentWindowId);
		System.out.println(driver.getTitle());

	}

}
