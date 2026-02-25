package Practicesetselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("dummy");
		password.clear();
		password.sendKeys("secret_sauce");
		
		WebElement loginBtn=driver.findElement(By.id("login-button"));
		System.out.println("Is login butto displayed?"+loginBtn.isDisplayed());
		System.out.println("Is login button enlabed?"+loginBtn.isEnabled());
		
		loginBtn.click();
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.className("Inventory_item_name"));
		System.out.println("product name:"+product.getText());
		String attributeValue=product.getAttribute("class");
		System.out.println("Class Attribute value:"+attributeValue);
		

	}

}
