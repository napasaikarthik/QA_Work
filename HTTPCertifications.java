package Test1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;

import com.sun.jna.platform.WindowUtils;

public class HTTPCertifications {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FirefoxProfile prof = new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver(prof);
		
		driver.get("https://www.google.com/");
		
		
		Set<Cookie> abc= driver.manage().getCookies();
		System.out.println(abc.size());
		driver.manage().deleteAllCookies();
		
		
		Set<Cookie> abcd= driver.manage().getCookies();
		System.out.println(abcd.size());
		
	File ScrFile	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScrFile, new File("D:\\Akhila.png"));
		
		
	   WindowsUtils.tryToKillByName("firefox.exe");
		
		
	}

}
