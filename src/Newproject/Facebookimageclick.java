package Newproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebookimageclick {

	private static final String ElementConditions = null;
	private static final WebDriverWait WebDriverWaitdriver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.partialLinkText("Forgot your password?"));
		password.clear();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWaitdriver,wait();
		WebElement message=wait.until(ElementConditions.visibiltyOfElementLocated(By.xpath("\"//a[@class='lfloat']"));
		WebElement image = driver.findElement(By.xpath("//a[@class='lfloat']"));
		image.clear();
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
