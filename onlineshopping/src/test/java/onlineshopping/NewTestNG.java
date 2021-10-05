package onlineshopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTestNG {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://google.com");
	  String site=driver.getTitle();
	 
	  Assert.assertEquals(site,"Google");
  }
  
}
