package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.BrowserUtils;
import utilities.ElementUtil;

public class ImportantChecks {

	public static void main(String[] args) {
		BrowserUtils br = new BrowserUtils();
		WebDriver driver =br.initializeDriver("Chrome");
		br.lunchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname = By.id("input-firstname");
		By Privacy = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		ElementUtil eleutil =new ElementUtil(driver);
		System.out.println(firstname);
//		eleutil.doSendKeys(firstname, "Saikat");
//		eleutil.getElement(firstname).clear();
//		eleutil.doSendKeys(firstname, "Maity");
		
		WebElement ele =eleutil.getElement(firstname);
//		CharSequence[] sequence = {"saikat","-",new StringBuilder("Maity")};
//		System.out.println(sequence.length);
//		
//		ele.sendKeys(sequence);
//		ele.sendKeys(null);
//		eleutil.doSendKeys(firstname, null);
//		eleutil.getElementAttribute(firstname,"");
//		
//		eleutil.doClick(firstname)
		System.out.println(ele.isSelected());
		ele.sendKeys("dfghhf");
		System.out.println(ele.isSelected());
		WebElement prele = eleutil.getElement(Privacy);
		System.out.println(prele.isSelected());
		prele.click();
		System.out.println(prele.isSelected());
		
		

	}

}
