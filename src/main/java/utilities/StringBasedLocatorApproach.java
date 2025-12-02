package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringBasedLocatorApproach {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_prime_ministers_of_India");
		
//		String pmSCss = "table[class='wikitable plainrowheaders'] tr:nth-child(n+2) th";
//		List<WebElement> pmelelist = getElements(pmSCss,"css");
//		List<String> pminfo = new ArrayList<String>();
//		for (WebElement e:pmelelist) {
//			pminfo.add(e.getText());
//		}
//		System.out.println(pminfo);
		String arr[] = {"a","b","c"};
		test(arr);
	}
	public static List<WebElement> getElements(String eleLocator, String lcatorType) {
		return driver.findElements(getBy(eleLocator,lcatorType));
	}
	public static WebElement getElement(String eleLocator, String lcatorType) {
		return driver.findElement(getBy(eleLocator,lcatorType));
	}
	public static By getBy(String eleLocator, String lcatorType) {
		By locator=null;
		switch (lcatorType.toUpperCase()) {
		case "ID":
			locator = By.id(eleLocator);
			break;
		case "NAME":
			locator = By.name(eleLocator);
			break;
		case "CLASS":
			locator = By.className(eleLocator);
			break;
		case "XPATH":
			locator = By.xpath(eleLocator);
			break;
		case "CSS":
			locator = By.cssSelector(eleLocator);
			break;
		case "LINKTEXT":
			locator = By.linkText(eleLocator);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(eleLocator);
			break;
		case "TAGNAME":
			locator = By.tagName(eleLocator);
			break;
	
		default:
			System.out.println("Please provie the correct locator type....");
			break;
		}
		return locator;
		
	}
	
	public static void test(String arr[]) {
		System.out.println(Arrays.toString(arr));
		
	}

}
