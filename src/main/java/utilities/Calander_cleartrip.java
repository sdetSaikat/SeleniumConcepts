package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander_cleartrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']//*[name()='svg']")).click();
		String expectedMMYY= "October 2025";
		String dateToSlected = "25";
		
		while(true) {
			
		List<WebElement> Calenderlist = driver.findElements(By.className("DayPicker-Month"));
			for(WebElement e : Calenderlist) {
				if (e.getText().equalsIgnoreCase(expectedMMYY)) {
					String MonthToBeSelected = e.getText();
					String Datepath = "//div[text()='"+MonthToBeSelected+"']"
							+ "/parent::div/following-sibling::div[@class='DayPicker-Body']//div[text()='"+dateToSlected+"']";
					driver.findElement(By.xpath(dateToSlected)).click();
					break;
				}
				break;
				
			}
		}

	}

}
