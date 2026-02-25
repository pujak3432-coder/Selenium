package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseACtion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);	
		WebElement doubleClickBtn=driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickBtn=driver.findElement(By.id("rightClickBt"));
		//double click
		action.doubleClick(doubleClickBtn).perform();
		System.out.println("Double click sucessfully");
		Thread.sleep(2000);
		//right click
		action.contextClick(rightClickBtn).perform();
		Thread.sleep(2000);
		// click and hold
		action.clickAndHold(doubleClickBtn).pause(2000).release().perform();
		Thread.sleep(3000);
		driver.quit();

	}

}
