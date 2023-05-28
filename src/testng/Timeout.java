package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout {
	WebDriver driver;
  @Test
   void GoogleSearchTitupathi() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("tirupathi");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  @Test(timeOut=200000)
  public void GoogleSearchSelenium() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
}
