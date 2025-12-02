package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysWithpause {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String first_name= "Saikat";
		By firstName=By.id("input-firstname");
		Actions act = new Actions(driver);
		char[] firstNameArray = first_name.toCharArray();
//		for(char c: firstNameArray) {
//			act.sendKeys(driver.findElement(firstName), String.valueOf(c)).pause(1000).perform();
//		}
		for(int i=0; i<first_name.length();i++) {
			act.sendKeys(driver.findElement(firstName), String.valueOf(first_name.charAt(i))).pause(1000).perform();
		}
	}
	/**
	 * This method is to send the each character of a string value one by one
	 * to a particular text field.user has the choice to give the pause time after 
	 * entering each character to make it visible.
	 * @param locator
	 * @param value
	 * @param pauseTime
	 */
	public static void doSendkeysWithPause(By locator,String value,long pauseTime) {
		Actions act = new Actions(driver);
		char valueArray[] = value.toCharArray();
		for(char c : valueArray) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendkeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
