package slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://m.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("ze.fathi@live.fr");
	driver.findElement(By.id("m_login_password")).sendKeys("Ilef12345");
	driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button")).click();
	driver.quit();
	
	}

}
