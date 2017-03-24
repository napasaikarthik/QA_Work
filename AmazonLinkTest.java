package Test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLinkTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement element  = driver.findElement(By.xpath(".//*[@id='navFooter']"));
		System.out.println(element.findElements(By.tagName("a")).size());
		WebElement A=driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[3]"));

		int B=(A.findElements(By.tagName("a")).size());
		
		int i;
		String BeforeClicking=null;
		String AfterClicking;
		
		for(i=0;i<B;i++)
		{
			
		//System.out.println(A.findElements(By.tagName("a")).get(i).getText());
		if(A.findElements(By.tagName("a")).get(i).getText().contains("Sell on Amazon"))
		{
		BeforeClicking= driver.getTitle();
		
		A.findElements(By.tagName("a")).get(i).click();
		break;
		
		}
		}
AfterClicking=driver.getTitle();

System.out.println(AfterClicking);

if(AfterClicking!=BeforeClicking)
{
	System.out.println("PASS");
	
	
	}
else
{
	
	System.out.println("FAIL");
}
	
					
		}
		
		
	}

