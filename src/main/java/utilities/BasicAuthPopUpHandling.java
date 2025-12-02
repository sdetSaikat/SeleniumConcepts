package utilities;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUpHandling {

	public static void main(String[] args) {
		String Username = "admin";
		String Password = "admin@123";
		WebDriver driver = new ChromeDriver();
		driver.get("https://"+Username+":"+Password+"@the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");
//		((HasAuthentication)driver).register(()->new UsernameAndPassword(Username, Password));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");

		
//		((HasAuthentication) driver).register(() -> new UsernameAndPassword(Username, Password));
//
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("username" + Keys.TAB + "password");
//		alert.accept();

	}

}
