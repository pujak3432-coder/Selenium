package Newproject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Excercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("page source is:"+driver.getPageSource());
		Thread.sleep(1500);
		driver.close();

	}

}
