package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RareUseofActionClass {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		Action dropaction = act.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable"))).release().build();
		
		dropaction.perform();
	
	}

}
