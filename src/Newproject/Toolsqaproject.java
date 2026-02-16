package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqaproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form/");
		driver.findElement(By.name("firstName")).sendKeys("Puja");
		driver.findElement(By.name("LastName")).sendKeys("Kumari");
		driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]")).click();

	}

}
