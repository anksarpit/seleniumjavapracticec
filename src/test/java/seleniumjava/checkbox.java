package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
	
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
		 
		//driver.quit();
	}
	
	
	
	@Test
	public void test2()
	{
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[@class=\"a-declarative\"]//span[text()=\"Samsung\"]")).click();
		
		
		List<WebElement> ramlist = driver.findElements(By.xpath("//ul[@id=\"filter-p_n_g-1003495121111\"]//div"));
		
		System.out.println(ramlist.size());
		
		for (WebElement  list : ramlist)
		{
			System.out.println(list.getText());
			
			if(list.getText().contains("2 to 3.9 GB"))
			{
				list.click();
			}
		}
		
		
	}


}


