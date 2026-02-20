package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		String baseUrl="https://the-internet.herokuapp.com/upload";
		driver.get(baseUrl);
		WebElement uploadElement=driver.findElement(By.id("file-upload"));
		Thread.sleep(2000);
		uploadElement.sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit"));
		Thread.sleep(2000);
		driver.close();
		

	}

}
