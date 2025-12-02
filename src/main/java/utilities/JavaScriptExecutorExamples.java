package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExamples {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript(" document.getElementsByName('agree')[0].click()");
		
	}

}
