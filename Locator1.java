
package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
	   //driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		
		driver.findElement(By.className("inputtext")).sendKeys("katkam.akhila@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Rishi143");
		driver.findElement(By.id("u_0_q")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Page")).click();
		
		
	}
}