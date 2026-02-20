package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String baseURL="https://www.letskodeit.com/practice?utm_source=chatgpt.com";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.id("multiple-select-example"));
		
		Select select = new Select(element);
		select.selectByValue("apple");
		select.selectByIndex(1);
		select.selectByVisibleText("peach");
		Thread.sleep(2000);
		select.deselectByIndex(1);
		driver.close();		

	}

}
