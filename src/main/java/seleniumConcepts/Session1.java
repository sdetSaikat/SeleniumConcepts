package seleniumConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.34.0");
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals("Maven Repository: org.seleniumhq.selenium » selenium-java » 4.34.0")) {
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is fail");
		}
		driver.quit();

	}

}
