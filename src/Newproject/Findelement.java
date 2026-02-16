package Newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement>element=driver.findElement(By.name("name"))
		System.out.println("Number of elements:"+element.size());	
		for(int i=0;i<element.size();i++) {
			System.out.println("Radio button text:"+element.get(i).getAttribute("value"));
		}
		
		

	}

}
