package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class EnabledFlase {
	private static final boolean flase = false;
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test
  public void gmail(){
	  driver.get("https://www.gmail.com");
  }
  
  @Test(enabled=flase)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test(priority=1)
  public void amazon() {
	  driver.get("https://www.amazon.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
