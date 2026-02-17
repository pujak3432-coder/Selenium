package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com%22);");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement enable=driver.findElement(By.id("enable-button"));
		enable.click();
		Thread.sleep(2000);
		System.out.println("isEnable status:"+driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.id("disabled-button")).click();
		Thread.sleep(2000);
		System.out.println("isEnable status:"+driver.findElement(By.id("enabled-example-input")).isEnabled());
		Thread.sleep(2000);
		System.out.println("GetTagname method returning text:"+enable.getTagName());
		System.out.println("GetAttribute method returning text:"+ enable.getAttribute("id"));
		System.out.println("GetSize method returning text:"+ enable.getSize());
		System.out.println("GetCSSValue method returning text:"+enable.getCssValue("id"));
		driver.close();
		
		
	
		
		

	}

}
