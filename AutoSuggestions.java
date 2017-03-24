package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		WebDriverWait wb = new WebDriverWait(driver,5);
		driver.findElement(By.xpath(".//*[@id='m_rtxtEmail1']")).sendKeys("akhila");
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[5]/p"))).click();
		
		
	}

}
