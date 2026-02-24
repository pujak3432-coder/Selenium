package Newproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		String parentId=driver.getWindowHandle(); // Store parent window ID
		
		//Click all child window buttons
		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		//Get all windows
		Set<String>allWindows=driver.getWindowHandles();
		 for(String id:allWindows) {
			 // If it is not parent → then it is child
			  if (!id.equals(parentId)) {
		 driver.switchTo().window(id);
		 Thread.sleep(2000);
		// Print text from child window
		 String text=driver.findElement(By.id("sampleHeading")).getText();
		 System.out.println("child window text:"+text);
		 driver.close();}}
		 //Switch back to parent window
		 driver.switchTo().window(parentId);
		 Thread.sleep(2000);
		 String parentHeading=driver.findElement(By.xpath("//h1")).getText();
		 System.out.println("Parent Heading:"+parentHeading);
		 Thread.sleep(2000);
		 driver.quit();

	}
		 }
		 
