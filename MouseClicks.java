
package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicks {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		Actions A= new Actions(driver);
	WebElement	element=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
	A.moveToElement(element).build().perform();
	WebElement B=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
	A.keyDown(Keys.SHIFT).moveToElement(B).sendKeys("Iphone").build().perform();
	A.contextClick(B).build().perform();
	//A.dragAndDrop(source, target);
		
		
		
		
	}

}
