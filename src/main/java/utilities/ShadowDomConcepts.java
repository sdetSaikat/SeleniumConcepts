package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomConcepts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement e =	(WebElement) js.executeScript(" return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		e.sendKeys("Saikat Maity");
	}

}
