package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stream {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		
//		
//		List<WebElement> pricelistWithDollar = driver.findElements(By.className("inventory_item_price"));
//		
//		List<String> collect = pricelistWithDollar.stream().map(e -> e.getText().replace("$", "")).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		List<String> collect2 = collect.stream().filter(e -> Double.parseDouble(e)>10.00).collect(Collectors.toList());
//		System.out.println(collect2);
		
		List<Integer> asList = Arrays.asList(25,110,15,220,30);
//		asList.add(35);
		String arr[] = {"Apple", "Banana", "Cherry"};
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
		
		
		
		System.out.println(asList.stream().max(Integer::compareTo).get());
		System.out.println(asList.stream().min(Integer::compareTo).get());
		
		String fruitsInList = arrayList.stream().collect(Collectors.joining("-"));
		System.out.println(fruitsInList);
		
		
		System.out.println(asList.stream().sorted().collect(Collectors.toList()));
		
		System.out.println(asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		

	}

}
