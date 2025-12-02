package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NonSelectBasedDropDown {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By dropDownLocator= By.xpath("(//span[@class='comboTreeArrowBtnImg'])[1]");
		By options= By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//span[@class='comboTreeItemTitle']");
		System.out.println(nonselectDropDown(dropDownLocator, options, "Saikat"));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * This is the  generic method for Non select based dropdown Handling
	 * 1.This methods works for single option selection
	 * 2.This methods works for Multiple option selection
	 * 1.This methods works all option selection as well
	 * @param droplocator
	 * @param optionSelector
	 * @param choicevalue
	 * @return upon slection this method will return a boolean result.
	 * If the option we trying to select is not present the this function will return False
	 */
	public static boolean nonselectDropDown(By droplocator,By optionSelector,String... choicevalue) {
		getElement(droplocator).click();
		List<WebElement> optionList = 
				driver.findElements(optionSelector);
		
		boolean flag= false;
		
		if(choicevalue[0].equalsIgnoreCase("all")) {
			for(WebElement e:optionList) {
				e.click();
			}
		}
		else 
		{
			for(WebElement e:optionList) {
				String text = e.getText();
				for(String s:choicevalue) {
				if(text.trim().equals(s)) {
					e.click();
					flag= true;
					break;
					}
				else {
					flag= false;
					}
				}
				
			}
		}
		return flag;
		
	}

}
