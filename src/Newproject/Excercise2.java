package Newproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println("page source is:"+driver.getPageSource());
		Thread.sleep(500);
		driver.close();

	}

}
