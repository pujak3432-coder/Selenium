package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		
		Actions action=new Actions(driver);
		//Find 'Main Item 1'
		WebElement mainItem1 =driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		//Move to 'Main Item 1'
		action.moveToElement(mainItem1).perform();
		Thread.sleep(2000);
		
		WebElement mainItem2 =driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(mainItem2).perform();
		Thread.sleep(2000);
		
		WebElement sublist= driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		sublist.click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
