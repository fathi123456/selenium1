package slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_selenium {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	driver.get("http://yahoo.com");
	driver.navigate().back();
	driver.close();
	}
	
	

}
