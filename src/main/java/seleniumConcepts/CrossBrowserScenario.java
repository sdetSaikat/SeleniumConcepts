package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserScenario {

	public static void main(String[] args) {
		WebDriver driver =null;
		String browserName = "chrome";
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
//			System.setProperty(browserName, browserName)
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "saffari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Invalid Browser!");
			throw new RuntimeException("Driver is not initialized");
		}
		
		
		driver.get("https://www.google.com");
		
		driver.close();
		
		driver.getTitle();
		

	}

}
