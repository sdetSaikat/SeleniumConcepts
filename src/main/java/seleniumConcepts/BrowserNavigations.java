package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {
	
	
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.opencart.com/index.php?route=common/home");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		
		driver.quit();
		

	}

}
