package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelectionByNaveen {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(10000);
		String expectedMMYY = "February 2020";
//		selectFutureCalenderDate(expectedMMYY, "10");
		selectPreviousCalenderDate(expectedMMYY,"20");

	}
	
	public static void selectFutureCalenderDate(String monthYear , String day) {
		
		String currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
		
		while(!currentDate.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[text() = 'Next']")).click();
			currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		driver.findElement(By.linkText(day)).click();
		
	}
	
	
public static void selectPreviousCalenderDate(String monthYear , String day) {
		
		String currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
		
		while(!currentDate.equalsIgnoreCase(monthYear)) {
			driver.findElement(By.xpath("//span[text() = 'Prev']")).click();
			currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		driver.findElement(By.linkText(day)).click();
		
	}

}
