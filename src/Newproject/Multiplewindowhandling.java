package Newproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewindowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Main page title"+driver.getTitle());
		
		// Click on New Tab button
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		  // Get all window IDs
		Set<String> ids = driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		
		String parentId=it.next(); // Main window
		String childId=it.next();// New tab window
		Thread.sleep(2000);
		
		driver.switchTo().window(childId); // Switch to child window
		System.out.println("Child Page Title:"+driver.getTitle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentId); // Switch to parent window
		System.out.println("Back to the parents Title:"+driver.getTitle());
		Thread.sleep(3000);
		Thread.sleep(3000);

	    driver.quit(); 

	}

}
