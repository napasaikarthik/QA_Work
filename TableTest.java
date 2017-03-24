package Test1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/415281.html");
		WebElement table = driver.findElement(By.id("full-scorecard"));
		
		java.util.List<WebElement> noofrows = table.findElements(By.tagName("tr"));
		
		System.out.println("No of rows " +noofrows.size());
		
		int i=0;
		
		for(WebElement eachrow:noofrows)
		{
			
			java.util.List<WebElement> eachcolumn=eachrow.findElements(By.tagName("td"));
			
			i++;
			System.out.println("no of columns in "+i+"th row are "+ eachcolumn.size());
			
			
		}
		
		
		
		
		
	}

}
