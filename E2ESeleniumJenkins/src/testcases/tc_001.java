package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_001 {
	
	ChromeDriver driver;
	@Test
	public void testcase1() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","/Users/neha/Downloads/Download_SW/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	String title=driver.getTitle();
	System.out.println("Page title is:"+title);
	}

	@Test
	public void findEmail()
	{
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		System.out.println("Element found:"+email.isDisplayed());
		
	}

	@Test
	public void notSelenium()
	{
	
		System.out.println("This is 3rd and last test case");
		
	}


}
