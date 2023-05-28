package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alphabaticalorder {
	WebDriver driver;
 public void twitter() {
	  driver.get("https://www.twitter.com");
	  
  }
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  } 
  @Test
  public void G() {
	  driver.get("https://www.gmail.com");
  } 
  
  @Test
  public void amazon() {
	  driver.get("https://www.amazon.com");
  } 
  
  
	  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
