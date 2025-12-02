package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference {

	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement first_name = driver.findElement(By.id("input-firstname"));
		first_name.sendKeys("Saikat");
		driver.navigate().refresh();
		first_name = driver.findElement(By.id("input-firstname"));
		
		first_name.sendKeys("Maity");

	}

}
