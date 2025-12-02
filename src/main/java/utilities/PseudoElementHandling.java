package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-confirm']\"),'::before').content";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String content = js.executeScript(script).toString();
		System.out.println(content);
	}

}
