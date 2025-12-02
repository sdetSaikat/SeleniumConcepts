package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//selenium 3.x systax was driver.manage().timeouts().implicitlyWait(10,TimeUnit.seconds); this is deprecated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//selenium 4.x syntax
		
		

	}

}
