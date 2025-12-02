package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForpageLoad {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/?root=logo");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String bool = js.executeScript(" return document.readyState == 'complete'").toString();
		System.out.println(bool);

	}

}