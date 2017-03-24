package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.goindigo.in/");
		
		driver.findElement(By.xpath(".//*[@id='bookingflightTab']/div[2]/div[1]/ul[1]/li[2]/a")).click();
		//
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button"));

		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		System.out.println("driver.switchTo().alert().accept().getText()");
		
		
	}

}
