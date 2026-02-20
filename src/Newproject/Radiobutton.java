package Newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice?utm_source=chatgpt.com%22");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radioButton1=driver.findElement(By.id("bmwradio"));
		radioButton1.click();
		Thread.sleep(2000);
		WebElement radioButton2=driver.findElement(By.id("benzradio"));
		radioButton2.click();
		Thread.sleep(2000);
		driver.close();
		;
		

	}

}
