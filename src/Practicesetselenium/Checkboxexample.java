package Practicesetselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxexample {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement checkbox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		if(!checkbox1.isSelected()) {
			checkbox1.click();
	}
		if(checkbox2.isSelected()) {
			checkbox2.click();
			System.out.println("checkbox 1 is selected status:"+checkbox1.isSelected());		
			System.out.println("checkbox 2 is selected status:"+checkbox2.isSelected());
			
			Thread.sleep(2000);
			driver.close();
		}}}