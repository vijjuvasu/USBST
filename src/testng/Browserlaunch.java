package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Browserlaunch {
	private static  
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("tirupathi");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
