package Test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		System.out.println(driver.getTitle());
		Set<String> A=driver.getWindowHandles();
		Iterator<String> B=A.iterator();
		String parentID=B.next();
		String ChildID=B.next();
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
	}

}
