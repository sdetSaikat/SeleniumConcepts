package utilities;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RegistrationWithTabSequence {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		Actions act = new Actions(driver);
		
		
				Action userRegistration = act
				.sendKeys(getElement(firstName), "Saikat")
					.pause(500)
					.sendKeys(Keys.TAB)
					.pause(500)
					.sendKeys("Maity")
					.pause(500)
					.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("maity1235@gmail.com")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("9871234654")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("abc1234#")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("abc1234#")
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.SPACE)
			.pause(500)
			.sendKeys(Keys.ENTER)
			.build();
			
				userRegistration.perform();

	}
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
