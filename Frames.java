package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//System.out.println(driver.getPageSource());
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".input_password")).sendKeys("akhilakatkam");
		
	}

}
