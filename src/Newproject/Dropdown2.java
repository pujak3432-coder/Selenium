package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String baseURL="https://the-internet.herokuapp.com/dropdown";
		driver.get(baseURL);
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='dropdown']"));
		Select select= new Select(dropdown1);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByVisibleText("Option 1");
		Thread.sleep(2000);
		driver.close();
	
	}

}
