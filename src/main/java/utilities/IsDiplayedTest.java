package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDiplayedTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		By forgotpassword = By.linkText("Forgotten Password");
//		int expectedCount = 2;
//		isDipalyedWithFindElements(forgotpassword, expectedCount);
		
		String[] split = "c Ankur Malik b Pheiroijam Jotin".split("b");
//		
		
		By googleSearch = By.name("q");
		
		By suggetionist = By.xpath("//div[contains(@class,'wM6W7d')]/span");
		String searchFor = "Virat kohli";
		String toeBeSelected = "age";
		driver.findElement(googleSearch).sendKeys(searchFor);
		Thread.sleep(5000);
//		searchFieldSelection(suggetionist, toeBeSelected);
		
	}
//	public static boolean isDipalyedWithFindElements(By eleLocator,int expectedcount) {
//		List<WebElement> elementsList = getElementsList(eleLocator);
//		if(elementsList.size()==expectedcount) {
//			System.out.println("The element is displayed "+ expectedcount+" times on the page" );
//			return true;
//			
//		}
//		else {
//			return false;
//		}
		
//}
	
	
	public static void fieldSelection(By locator,String ToSelect){
		List<WebElement> eleList = getElementsList(locator);
		for(WebElement e : eleList) {
			if(e.getText().length()!=0) {
				if(e.getText().contains(ToSelect)) {
					e.click();
					break;
				}
			}
		}		
	}
	
	public static List<WebElement> getElementsList(By locator) {
		return driver.findElements(locator);
	}
}
