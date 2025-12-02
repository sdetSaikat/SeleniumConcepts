package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationSingleSelection {
	static WebDriver driver;
	public static void main(String[] args) {
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
			
			if(driver.findElements(countryLocator).size()>0) {
				
				selectCountry(CountryName);
				break;
			}
			else {
				WebElement nextArrow = driver.findElement(By.cssSelector("button.next"));
				if (nextArrow.isEnabled()) {
					nextArrow.click();
				}
				else {
					System.out.println("You have reached to the end of the search ans the '"+CountryName+""
							+ "' is not found in the list...");
					break;
				}
				
			}
			
			
		}
		
		
		
		

	}
	
	
	public static void selectCountry(String countryName) {
		
		String countryCheckBox ="//td[text() = '"+countryName+"']/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(countryCheckBox)).click();
		
	}
	
	

}
