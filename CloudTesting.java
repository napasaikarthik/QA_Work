package Test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CloudTesting {

	public static void main(String[] args) throws MalformedURLException {
	
		
		DesiredCapabilities CP= DesiredCapabilities.firefox();
		CP.setCapability("platform", "Android");
		CP.setCapability("Version", "45");
		WebDriver driver = new RemoteWebDriver(new  URL("http://katkam.akhila:80f8f406-35a4-4dd9-91d0-bca3c4a2f05e@ondemand.saucelabs.com:80/wd/hub"),CP);
		 driver.get("http://google.com");
		 System.out.println(driver.getTitle());
		
		
	

	}

}
