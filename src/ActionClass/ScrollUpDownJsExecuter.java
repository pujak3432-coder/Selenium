package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownJsExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://export.ebay.com/in/");
		Thread.sleep(2000);
		// Reject cookies (if present)
		try {
			driver.findElement(By.id("onetrust-reject-all-handler")).click();
		} catch (Exception e) {
			System.out.println("Cookie popup not displayed");
			
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        
        WebElement element = driver.findElement(By.xpath("//h2[text()='Make your listings stand out!']"));
		
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(2000);
        
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(2000);
        driver.quit();

		

	}

	}}
