package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReusableFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://patrickhlauke.github.io/recaptcha/");
		int number = findframenumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
        
		int number1 = findframenumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		
	}
	
	
	public static int findframenumber(WebDriver driver, By B)
	{
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for( i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);		
			int count = driver.findElements(B).size();
			if(count>0)
			{
				break;
			}
			else
			{
				System.out.println("Continue Looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

}
