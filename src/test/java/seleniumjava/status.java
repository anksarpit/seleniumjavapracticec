package seleniumjava;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class status 
{
	
WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@After
	public void teardown()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		driver.quit();
	}
	
	
	
	@Test
	public void test2()
	{
		driver.get("https://edu.google.com/intl/en-US/workspace-for-education/products/classroom/");
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Google Classroom logo']"));
		
		System.out.println(img.isDisplayed());
		
		System.out.println(img.isEnabled());
		
		System.out.println(img.isSelected());
				
	}

}
