package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://patrickhlauke.github.io/recaptcha/");
		SwitchToFrame(driver);
		
		
		
	}
	
	
	public static void SwitchToFrame (WebDriver driver)
	
	{
		
		int Count =driver.findElements(By.tagName("iframe")).size();
	for(int i=0; i<Count;i++)
		{
			
		driver.switchTo().frame(i);
		
		int FrameCount=driver.findElements(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).size();
		
		
		if(FrameCount>0)
		{
			
			
			driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
			
			break;
			
			
		}
		
		else
		{
			System.out.println("Continue the loop");
			
		}
	
		
	}

	}}
