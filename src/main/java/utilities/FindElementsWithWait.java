package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementsWithWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> footerLinks = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//footer//a")));
		System.out.println(footerLinks);

	}

}
