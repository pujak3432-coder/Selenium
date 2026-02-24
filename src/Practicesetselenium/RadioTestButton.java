package Practicesetselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTestButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		Thread.sleep(2000);
		WebElement yesRadio=driver.findElement(By.xpath(null))
		
	}

}
