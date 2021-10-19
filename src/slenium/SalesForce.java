package slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {

		
WebDriver driver = new ChromeDriver();
driver.get("https://login.salesforce.com/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("momolina86@gmail.com");	
		
driver.findElement(By.name("pw")).sendKeys("ilef123456");

driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

System.out.println(driver.getCurrentUrl());
		
	}

}
