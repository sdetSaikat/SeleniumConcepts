package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		driver.manage().window().fullscreen();
//		Thread.sleep(15);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id]")));
		By alabama= By.xpath("(//*[name() = 'svg' and @id = 'map-svg']//*[name() ='g' and @id = 'regions']/*)[1]");
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		WebElement SvgElement = wait.
//				until(ExpectedConditions.visibilityOfElementLocated(alabama));
		List<WebElement> elementlist = driver.findElements(By.xpath("//*[name() = 'svg' and @id = 'map-svg']//*[name() ='g' and @id = 'regions']/*"));
		
		Actions act = new Actions(driver);
		
		for(WebElement e : elementlist) {
			System.out.println(e.getDomAttribute("id"));
			act.moveToElement(e).pause(500).perform();
			
		}

	}

}
