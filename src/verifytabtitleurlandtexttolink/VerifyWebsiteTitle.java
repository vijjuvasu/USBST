package verifytabtitleurlandtexttolink;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;


public class VerifyWebsiteTitle {
	WebDriver driver;
  @Test
  public void verifyWebTitle() throws Exception {
	  driver.get("https://WWW.google.com/");
	  Thread.sleep(3000);
	  String   exptabtitle = "Google";
	  System.out.println("expected tab title");
	  String  acttabtitile = driver.getTitle();
	  Assert.assertEquals(acttabtitile, exptabtitle);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
  }

}
