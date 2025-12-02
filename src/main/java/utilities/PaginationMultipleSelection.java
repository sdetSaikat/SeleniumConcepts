package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationMultipleSelection {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page");
			JavascriptExecutor js =(JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = driver.findElement(By.id("tablepress-1-name"));
			js.executeScript("arguments[0].scrollIntoView(true)",element);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dt-search-0")));
			String CountryName ="Hong Kong";
			By countryLocator = By.xpath("//td[text() = '"+CountryName+"']");
			
			while(true) {
				
				WebElement nextArrow = driver.findElement(By.cssSelector("button.next"));
				if (driver.findElements(countryLocator).size()>0) {
					selectMultiple(CountryName);
				
				}
				if (nextArrow.isEnabled()) {
						nextArrow.click();
						Thread.sleep(2000);
				}
				else {
					System.out.println("You have reached to the end of the search...Thanks!");
						break;
					}
				}
			}
			
		
		
		public static void selectMultiple(String countryName) {
			String countryCheckBox ="//td[text() = '"+countryName+"']/preceding-sibling::td/input[@type='checkbox']";
			List<WebElement> elements = driver.findElements(By.xpath(countryCheckBox));
			elements.stream().forEach(e->e.click());
			
		}

}
