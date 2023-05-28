package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Dropdown {
	WebDriver driver;
  @Test
  public void dropdown() {
	  driver.get("http://baalabharathi.com/upload-story/");
	  driver.findElement(By.name("field-5vlVJGcSKva7av0")).sendKeys("48334");
//new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByVisibleText("Belgium");
	 // new  Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByValue("AL");
	  new  Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByIndex(10);
	    
	    
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
