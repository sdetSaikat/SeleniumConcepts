package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streamassignments1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> pricelistWithDollar = driver.findElements(By.className("inventory_item_price"));
		
		pricelistWithDollar
			.stream()
				.map(e-> e.getText())
					.filter(e->e.equals("$29.99"))
						.forEach(e-> driver.findElement(By.xpath("//div[normalize-space()='$29.99']/following-sibling::button")).click());
					
						
				
				
//					.filter(e->e.equals("$29.99"))
//						.forEach(e-> driver.findElement(By.xpath("//div[normalize-space()='"+e+"']/following-sibling::button")).click());

		
		//pricelistWithDollar.stream().filter(e->e.getText().contains("29.99")).forEach(e-> driver.findElement(By.xpath("//div[normalize-space()='"+e.getText()+"']/following-sibling::button")).click());
	}

}
