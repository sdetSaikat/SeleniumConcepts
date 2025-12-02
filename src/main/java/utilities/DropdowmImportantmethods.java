package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdowmImportantmethods {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By dropDownEle= By.cssSelector("#Form_getForm_Country");
		
//		Select select = new Select(driver.findElement(dropDownEle));
//		
//		System.out.println(select.isMultiple());
//		if(select.isMultiple()) {
//			select.selectByVisibleText("Andean flamingo");
//			select.selectByVisibleText("Greater flamingo");
//			select.selectByVisibleText("Lesser flamingo");
//		}
//		else {
//			System.out.println("Multiple selction is not available");
//		}
//		
//		select.deselectByVisibleText("Andean flamingo");
//		Thread.sleep(1000);
//		select.deselectByIndex(3);
//		
//		Thread.sleep(1000);
//		select.deselectByValue("Lesser");
//		
//		boolean flag = dropDownWithOutMethods(dropDownEle, "saikat");
//		if(flag) {
//			System.out.println("Test is passed");
//		}
//		else {
//			System.out.println("Test is faled");
//		}
		
		List<String> dropDownOptions = getOptionList(dropDownEle);
		System.out.println(dropDownOptions);
		
		List<String> sublist = Arrays.asList("Algeria","Afghanistan");
		
		if(dropDownOptions.containsAll(sublist)) 
		{
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is Faild");
		}
		
		
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean dropDownWithOutMethods(By Droplocator,String toBeSelcted) {
		Select select = new Select(getElement(Droplocator));
		List<WebElement> optionslist = select.getOptions();
		for(WebElement e: optionslist) {
			if(e.getText().trim().equals(toBeSelcted)) {
				
				e.click();
				System.out.println(toBeSelcted+" option is selected from the dropdown ");
				return true;
			}
		}
		System.out.println(toBeSelcted+" option is not available in the dropdown ");
		return false;
	}
	
	
	public static boolean dropDownWithOutSelectClasss(By optionsLocator,String toBeSelcted) {
		List<WebElement> optionlists = driver.findElements(optionsLocator);
		for(WebElement e: optionlists) {
			if(e.getText().equals(toBeSelcted)) {
				e.click();
				System.out.println(toBeSelcted+" option is selected from the dropdown ");
				return true;
			}
		}
		System.out.println(toBeSelcted+" option is not available in the dropdown ");
		return false;
	}
		
	
	public static List<String> getOptionList(By optionsLocator) {
		Select select = new Select(getElement(optionsLocator));
		List<WebElement> optionElelists = select.getOptions();
		List<String> optionsList= new ArrayList<String>();
		for(WebElement e: optionElelists) {
			optionsList.add(e.getText().trim());
		}
		return optionsList;
		
	}
	}


