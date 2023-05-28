package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Description {
	WebDriver driver; 
  @Test(description="top menus")
  public void RM_1() {
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"help\"]")).click();
  }
  @Test(description="register")
  public void RM_4() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("alladivijayalakshmi96@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("hello123@");
  }
  @Test(description="signin")
	  public void RM_5() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redmine.org");
  }
}
