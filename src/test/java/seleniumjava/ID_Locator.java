package seleniumjava;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locator 
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
	public void test()
	{
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		email.sendKeys("9685281914");
		pass.sendKeys("anks@007");
		loginbutton.click();
		
//		String actualurl = driver.getCurrentUrl();
//		assertEquals(actualurl, "https://www.facebook.com/", "matched");
	}
	
	
	
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//driver.findElement(By.linkText("Privacy Policy")).click();
		driver.findElement(By.partialLinkText("Privacy")).click();
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
