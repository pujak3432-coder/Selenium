package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imageclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("\"//*[@id=\\\"login-button\\\""));
		Thread.sleep(2000);
		driver.findElement(By.id("item_5_img_link")).clear();
		Thread.sleep(2000);
		driver.close();
		

	}

}
