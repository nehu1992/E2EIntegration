package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_001 {
	
	ChromeDriver driver;
	@Test
	public void testcase1() {
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



}
