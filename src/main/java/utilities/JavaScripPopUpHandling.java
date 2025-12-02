package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripPopUpHandling {
	static Alert alert;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement alertJsPoUp  = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement confirmJsPoUp  = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement PromptJsPopUp  = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		WebElement result = driver.findElement(By.id("result"));
		alertJsPoUp.click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(4000);
		alert.accept();
		System.out.println("Alert result :"+result.getText());
		confirmJsPoUp.click();
		Thread.sleep(1000);
		System.out.println(alert.getText());
		alert.dismiss();
		System.out.println("confirm popup result :"+result.getText());
		PromptJsPopUp.click();
		alert.sendKeys("I am a prompt");
		Thread.sleep(4000);
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("prompt result :"+result.getText());
		
		

	}

}
