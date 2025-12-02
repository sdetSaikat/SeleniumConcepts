package utilities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumConcepts.FindElementsConcepts;

public class Test {

	public static void main(String[] args) throws MalformedURLException {
		
		String url ="https://naveenautomationlabs.com/opencart/index.php?route=account/login";
//		URL appURL = new URL("https://www.opencart.com/index.php?route=common/home");
		BrowserUtils br = new BrowserUtils();
		WebDriver driver =br.initializeDriver("chrome");
		br.lunchURL(url);
//		System.out.println(br.pageTitle());
//		br.lunchUrlFromUrlObject(appURL);
//		System.out.println(br.pageTitle());
//		br.NavigateToPreviousPage();
//		System.out.println(br.pageTitle());
//		br.NavigateToNextPage();
//		System.out.println(br.pageTitle());
//		br.quitBrowser();
//		By email = By.id("input-email");
//		By idField = By.id("input-password");
		By register = By.linkText("Register");
		ElementUtil eutil = new ElementUtil(driver);
//		eutil.doSendKeys(email, "s.maity.gcect@gmail.com");
//		eutil.doSendKeys(idField, "Mahadev1234#");
		
		eutil.doClick(register);
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		By privacyPolicy = By.xpath("//input[@type = 'checkbox']");
		By okcontinue = By.xpath("//input[@value = 'Continue']");
		
//		br.quitBrowser();
		eutil.doSendKeys(firstName, "Saikat");
		eutil.doSendKeys(lastName, "Maity");
		eutil.doSendKeys(email, "abcsaikat8147@gmail.com");
		eutil.doSendKeys(telephone, "8147122334");
		eutil.doSendKeys(password, "Mahadev1234#");
		eutil.doSendKeys(confirmPassword, "Mahadev1234#");
		eutil.doClick(privacyPolicy);
		eutil.doClick(okcontinue);
		
		String pageCurrentTitle =br.pageTitle();
		String pageCurrentUrl =br.pageURl();
		String expectedHeader = "Your Account Has Been Created!";
		String LogOutText ="Logout";
		
		By accountHeader = By.tagName("h1");
		By logOutButton = By.linkText("Logout");
		
		/**
		 * Writing the assertions below.
		 */
		
		if(pageCurrentTitle.equals("Your Account Has Been Created!")){
			System.out.println("Title validation is passed");
		}
		else {
			System.out.println("Title validation is failed");
		}
		
		if(pageCurrentUrl.contains("route=account/success")){
			System.out.println("Url validation is passed");
		}
		else {
			System.out.println("Url validation is failed");
		}
		
		if(eutil.getElementText(accountHeader).equals(expectedHeader)){
			System.out.println("Header validation is passed");
		}
		else {
			System.out.println("Header validation is failed");
		}
		
		if(eutil.getElementText(logOutButton).equals(LogOutText)){
			System.out.println("Logout link is available");
		}
		else {
			System.out.println("Logout link is not present");
		}
		
		
		FindElementsConcepts fn =new FindElementsConcepts();

	}
	

}
