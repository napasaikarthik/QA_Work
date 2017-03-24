package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());



		
		
	}

}
