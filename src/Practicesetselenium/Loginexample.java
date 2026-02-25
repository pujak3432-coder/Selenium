package Practicesetselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginexample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[@type='submit']"));
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links on page: "+ Links.size());
		Thread.sleep(2000);
	
	}

}
