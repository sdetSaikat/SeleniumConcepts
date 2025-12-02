package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUps {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.findElement(By.id("file-upload")).sendKeys("/Users/saikatmaity/Desktop/Shots&Docs/Saikat.png");
	String windowHandle = driver.getWindowHandle();
	
	WebDriver newWindow2 = driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://WWW.google.com");
	driver.close();
	driver.switchTo().window(windowHandle);
	driver.get("https://WWW.google.com");
	
	

	}

}
