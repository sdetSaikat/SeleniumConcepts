package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelectionByMe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(10000);
		String expectedMMYY = "February 2020";
		String date = "14";
		
		String intialDate =driver.findElement(By.className("ui-datepicker-title")).getText();
		
		// This is for the Future Date
		if (Integer.parseInt(expectedMMYY.split(" ")[1])>= Integer.parseInt(intialDate.split(" ")[1])) {
		
			while(true) {
			
			String currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
			
			if(currentDate.equalsIgnoreCase(expectedMMYY)) {
				driver.findElement(By.linkText(date)).click();
				break;
			}
			WebElement nextbutton = driver.findElement(By.xpath("//span[text() = 'Next']"));
			if(!nextbutton.isEnabled()) {
				System.out.println("Reached the end of the search!!!!!!");
				break;
			}
			nextbutton.click();			
		}
			
		 
			}
		
		//This for the previous Date
		else {
			
			while(true) {
				
				String currentDate =driver.findElement(By.className("ui-datepicker-title")).getText();
				
				if(currentDate.equalsIgnoreCase(expectedMMYY)) {
					driver.findElement(By.linkText(date)).click();
					break;
				}
				WebElement prevbutton = driver.findElement(By.xpath("//span[text() = 'Prev']"));
				if(!prevbutton.isEnabled()) {
					System.out.println("Reached the end of the search!!!!!!");
					break;
				}
				prevbutton.click();			
			}
		}
				
			
				
				

	}

}
