package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcepts{

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/?entry_point=logged_out_dialog&next=%2Fgroups%2F190260783674020%2Fposts%2F470945265605569%2F");
		
//		By seleniumDescription= By.cssSelector("#day");
//		By refrenceElement= By.xpath("//label[normalize-space()='Male']");
//		
//		
//		driver.findElement(RelativeLocator.with(seleniumDescription).toLeftOf(refrenceElement)).click();
//		
//		System.out.println(aboutSelenium);
		
//		driver.quit();

	}

}
