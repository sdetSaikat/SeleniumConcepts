package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameHandling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://selectorshub.com/iframe-scenario");
	Thread.sleep(4000);
	driver.switchTo().frame("pact1");
	String Level1Text = driver.findElement(By.id("lost")).getText();
	System.out.println(Level1Text);
	driver.switchTo().frame("pact2");
	String Level2Text = driver.findElement(By.id("connect")).getText();
	System.out.println(Level2Text);
	driver.switchTo().frame("pact3");
	String Level3Text = driver.findElement(By.id("close")).getText();
	System.out.println(Level3Text);
	
	System.out.println("*****************************************");
//	
//	driver.findElement(By.id("glaf")).sendKeys("In Level3");
//	
//	String Level3Enteredvalue = driver.findElement(By.id("glaf")).getDomProperty("value");
//	System.out.println(Level3Enteredvalue);
//	
//	driver.switchTo().parentFrame();
//	driver.findElement(By.id("jex")).sendKeys("In Level2");
//	String Level2Enteredvalue =driver.findElement(By.id("jex")).getDomProperty("value");
//	System.out.println(Level2Enteredvalue);
//	
//	driver.switchTo().parentFrame();
//	driver.findElement(By.id("inp_val")).sendKeys("In Level1");
//	String Level1Enteredvalue =driver.findElement(By.id("inp_val")).getDomProperty("value");
//	System.out.println(Level1Enteredvalue);
//	
	driver.switchTo().defaultContent();
	Actions act = new Actions(driver);
	act.click(driver.findElement(By.linkText("Products"))).perform();
	
	List<WebElement> elements = driver.findElements(By.xpath("((//ul[contains(@id,'menu-1')])[1]/li)[1]//li"));
	System.out.println(elements.size());
	List<String> eletext = new ArrayList<String>();
	for(WebElement ele : elements) {
		eletext.add(ele.getText());
	}
	System.out.println(eletext);
	
	}
	

}
