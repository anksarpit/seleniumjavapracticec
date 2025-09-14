package seleniumjava;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector 
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
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("anks");
		
		//WebElement box = driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
		
		WebElement box = driver.findElement(By.cssSelector("textarea#APjFqb"));

		box.sendKeys("anks");
		
//		System.out.println(box.isDisplayed());
//		
//		System.out.println(box.isEnabled());
//		
//		System.out.println(box.isSelected());
				
	}


}
