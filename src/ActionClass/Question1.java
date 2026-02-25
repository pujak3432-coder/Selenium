package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/menu/");
	        
	        Actions action = new Actions(driver);
	        
	        // Create Actions class object
	        Actions action1 = new Actions(driver);

	        // Step 2: Find ‘Music’ element
	        WebElement music = driver.findElement(By.xpath("//a[text()='Music']"));

	        // Step 3: Mouse hover on ‘Music’
	        action1.moveToElement(music).perform();
	        Thread.sleep(2000);

	        // Step 4: Find ‘Rock’ element
	        WebElement rock = driver.findElement(By.xpath("//a[text()='Rock']"));
	        
	        // Step 5: Mouse hover on ‘Rock’
	        action1.moveToElement(rock).perform();
	        Thread.sleep(2000);

	        // Step 6: Find ‘Alternative’ element
	        WebElement alternative = driver.findElement(By.xpath("//a[text()='Alternative']"));

	        // Step 7: Click on ‘Alternative’
	        alternative.click();
	        
	     // Step 8: Close browser
	        Thread.sleep(2000);
	        driver.quit();


	}

}
