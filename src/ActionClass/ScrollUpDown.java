package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUpDown {

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
		}
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.END).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
