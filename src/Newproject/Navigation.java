package Newproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigation {
	public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	String URL="http://www.facebook.com";
	driver.navigate().to(URL);
	driver.findElement(By.linkText("Forgetten password?")).click();
	driver.findElement(By.id("identify_email")).sendKeys("Test@email.com");
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	driver.close();

}
}