package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
	/*	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
		.click();
		driver.findElement(By.xpath(".//a[@value='DEL']")).click(); */
		
		
		
Select D = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
D.selectByIndex(0);
D.selectByValue("9");
D.selectByVisibleText("6 Adults");


System.out.print(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_IndArm']/label")).isSelected());
driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_IndArm']/label")).click();
System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_IndArm']/label")).isSelected());


	}

}
