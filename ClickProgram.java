package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("facebook.com");
		System.out.println(driver.getTitle());

		
		
		

	}

}
