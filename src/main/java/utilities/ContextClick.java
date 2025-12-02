package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act= new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text() ='right click me']"))).perform();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class]/li/span"));
		for(WebElement e : elements) {
			System.out.println(e.getText());
		}
		

	}

}
