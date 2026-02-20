package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl="https://demo.guru99.com/test/upload/";
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(2000);
		WebElement uploadElement=driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("term")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("send")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
