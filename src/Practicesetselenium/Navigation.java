package Practicesetselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println("Page Title is:"+title);
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}

}
