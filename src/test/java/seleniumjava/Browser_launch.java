package seleniumjava;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch 
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
		driver.get("https://github.com/PriyankaNigade18/AutomationTesting-SA2032");
		String actualtitle = driver.getTitle();
		assertEquals(actualtitle, "GitHub - PriyankaNigade18/AutomationTesting-SA2032: This is live training.....", "matched");
	}
	
	
	
	
	

}
