package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindElemensTests {

	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.initializeDriver("chrome");
		ElementUtil eleutil = new ElementUtil(driver);
		br.lunchURL("https://www.cricbuzz.com/");
		By imgTitleLocator = By.tagName("a");
		int eletListSize = eleutil.getEletListSize(imgTitleLocator);
		if(eletListSize>50) {
			System.out.println("Size test is passed");
		}
		else {
			System.out.println("Size test is not passed");
		}
		
		List<String> eleTextList = eleutil.getEleTextList(imgTitleLocator);
		if (eleTextList.contains("POINTS TABLE")) {
			System.out.println("Valid list is received---Passed");
		}
		else {
			System.out.println("InValid list is received---Failed");
		}

	}

}
