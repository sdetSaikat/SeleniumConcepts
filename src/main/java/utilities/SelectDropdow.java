package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdow {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/"
				+ "?entry_point=logged_out_dialog&next=%2Fgroups%"
				+ "2F190260783674020%2Fposts%2F470945265605569%2F");
		
		By dayDropDrwn = By.cssSelector("#day");
		By monthDropDrwn = By.cssSelector("#month");
		By yearDropDrwn = By.cssSelector("#year");
//		By dateToSelect= By.xpath("//option[text()=1]");
//		driver.findElement(dateToSelect).click();
		
		selectionByindex(dayDropDrwn, 4);
		selectionByValue(monthDropDrwn, "5");
		selectionByVisibleText(yearDropDrwn, "1991");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean selectionByVisibleText(By locator,String optionText) {
		WebElement dropDownEle =getElement(locator);
		Select select=new Select(dropDownEle);
		try {
		select.selectByVisibleText(optionText);
		return true;
		}
		catch(NoSuchElementException e){
			System.out.println("The option is not available with the text:-"+optionText);
			return false;
		}
	}
	
	public static boolean selectionByindex(By locator,int index) {
		WebElement dropDownEle =getElement(locator);
		Select select=new Select(dropDownEle);
		try {
		select.selectByIndex(index);
		return true;
		}
		catch(NoSuchElementException e){
			System.out.println("The option is not available with the index:-"+index);
			return false;
		}
	}
	
	public static boolean selectionByValue(By locator,String value) {
		WebElement dropDownEle =getElement(locator);
		Select select=new Select(dropDownEle);
		try {
		select.selectByValue(value);
		return true;
		}
		catch(NoSuchElementException e){
			System.out.println("The option is not available with the value:-"+value);
			return false;
		}
	}

}
