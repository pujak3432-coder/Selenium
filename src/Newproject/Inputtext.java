package Newproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Inputtext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/facebook.html");
		WebElement w=driver.findElement(By.className("inputtext"));
		w.sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_b")).submit();
		Thread.sleep(2000);
		driver.close();

	}

}
