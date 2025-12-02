package utilities;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtils {

	private WebDriver driver;
	
	public WebDriver initializeDriver(String browserName) {
		System.out.println("Lunching the "+browserName+" Browser ....");
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "saffari":
			driver = new SafariDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("The support is available for  "+browserName+" browser");
			throw new BrowserException("===INVALID BROWSER====");
		}
		
		return driver;	
		
	}
	
	public void lunchURL(String url) {
		nullCheck(url);
		lengthCheck(url);
		httpCheck(url);
		driver.get(url);
	}
	
	public void lunchUrlFromUrlObject(URL url) {
	
		String appUrl= url.toString();
//		String appUrl1= String.valueOf(url);
		
//		driver.get(url.toString());
		nullCheck(appUrl);
		lengthCheck(appUrl);
		httpCheck(appUrl);
		driver.navigate().to(url);
	}
	
	
	
	public String pageURl() {
		return driver.getCurrentUrl();
	}
	
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public void NavigateToPreviousPage() {
		driver.navigate().back();
	}
	
	public void NavigateToNextPage() {
		driver.navigate().forward();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	private void lengthCheck(String url) {
		if(url.length()==0) {
			throw new BrowserException("==Url can not be blank==");
		}
	}
	
	private void httpCheck(String url) {
		if(url.indexOf("https://")!=0) {
			throw new BrowserException("==Missing http at the Start of the url ==");
		}
	}
	
	private void nullCheck(String url) {
		if(url==null) {
			throw new BrowserException("==URL is Null ==");
		}
	}
	
	public static void name() {}
}
