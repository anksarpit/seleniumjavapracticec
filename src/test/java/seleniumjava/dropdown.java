package seleniumjava;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement dayele = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		
		WebElement monthele = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		WebElement yearele = driver.findElement(By.xpath("//select[@id=\"year\"]"));


		Select day = new Select(dayele);
		day.selectByVisibleText("10");
		day.selectByIndex(5);
		day.selectByValue("10");
		
	}
	
	@Test
	public void test2()
	{
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		List<WebElement> genlist = driver.findElements(By.xpath("//span[@data-type=\"radio\"]//span"));
		
		for(WebElement  list: genlist)
		{
			System.out.println(list.getText());
			
			if(list.getText().contains("Male"))
			{
				list.click();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}}
