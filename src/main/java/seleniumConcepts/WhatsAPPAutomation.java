package seleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhatsAPPAutomation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com");

		// Wait until the user scans QR code manually
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(240));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//canvas[@aria-label='Scan this QR code to link a device!']")));

		System.out.println("Scan the QR code to continue...");

	}

}
