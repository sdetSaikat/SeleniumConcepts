package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownChecks {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		By american=By.xpath("//option[normalize-space()='American Samoa']");
		driver.findElement(american).click();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By xyz=By.xpath("(//span[contains(text(),'choice 1')])[1]");
		driver.findElement(xyz).click();
	}

}
