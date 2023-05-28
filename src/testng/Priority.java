package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Priority {
	WebDriver driver;
  @Test(priority=3)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @Test(priority=2)
  public void twitter() {
	  driver.get("https://www.twitter.com");
  }
  @Test(priority=1)
 
  public void facebook() {
	  driver.get("https://wwww.facebook.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
