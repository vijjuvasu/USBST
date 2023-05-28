package verifytabtitleurlandtexttolink;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Verifyturl {
	WebDriver driver;
  @Test
  public void verifiGoogleUrl() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  String expectedUrl = "google.com";
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl,expectedUrl );
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
	  
  }

}
