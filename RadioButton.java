package Test1;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath(".//input[@value='Milk']")).click();
		int count =System.out.println(driver.findElements(By.xpath(".//input[@name='group1']").size();
	 
	

	for (int i =0; i<count;i++)
	{
	String text=driver.findElements(By.xpath(".//input[@name='group1")).get(i).click();
	
		
	}

	}
}

	