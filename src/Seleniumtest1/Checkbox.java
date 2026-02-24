package Seleniumtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1])"));
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2])"));
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}
		if(checkbox2.isSelected()) {
			checkbox2.click();
		}
		System.out.println("status of checkbox1?"+checkbox1.isDisplayed());
		System.out.println("status of checkbox2?"+checkbox2.isDisplayed());
		Thread.sleep(2000);
		driver.close();
	
	}

}
