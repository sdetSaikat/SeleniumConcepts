package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsmethods {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
//		driver.get("https://www.spicejet.com/");
//		By ourProgram = By.xpath("//div[text()='Our Program']");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"))).build().perform();
//		act.moveToElement(driver.findElement(ourProgram)).click().perform();
		

//		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
//		act.moveToElement(driver.findElement(By.linkText("MP3 Players"))).perform();
//		By parentMenu =By.linkText("MP3 Players");
//		act.moveToElement(driver.findElement(By.xpath("//a[text()='test 11 (0)']"))).click().perform();
//		act.click(driver.findElement(By.xpath("//a[text()='test 11 (0)']"))).perform()
//		By SubMenu= By.xpath("//a[text()='test 11 (0)']");
//		parentMenuSubMenuAction(parentMenu, SubMenu);
		driver.get("https://www.bigbasket.com/");
		By shopBy= By.xpath("(//span[text()='Shop by'])[2]");
		By electronics = By.linkText("Electronics");
		By cameraAccesories = By.linkText("Cameras & Accessories");
		By instantCameras=By.linkText("Instant Cameras");
		fourLevelMenuHandling(shopBy, electronics, cameraAccesories, instantCameras);
		Thread.sleep(6000);
		List<WebElement> CameraList = driver.findElements(By.xpath("//img[@title]"));
		System.out.println(CameraList.size());
		for(WebElement e : CameraList) {
			System.out.println(e.getDomAttribute("title"));
		}
		
	}
	public static WebElement getElemnet(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentMenuSubMenuAction(By ParentMenuLocator,By subMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElemnet(ParentMenuLocator)).perform();
		Thread.sleep(2000);
		getElemnet(subMenuLocator).click();
	
	}
	
	public static void fourLevelMenuHandling(By shopBy,By electronics,By cameraAccesories,By instantCameras ) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElemnet(shopBy)).click().perform();
		Thread.sleep(2000);
		act.moveToElement(getElemnet(electronics)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElemnet(cameraAccesories)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElemnet(instantCameras)).click().perform();

	}

}
