package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertOkButton {
	WebDriver driver;
  @Test
  public void alerttOkButton() throws Exception  {
	  driver.get(("http://seleniumlearn.com/confirmation-dialog-box"));
	  Thread.sleep(7000);
	  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
Thread.sleep(5000);
	  driver.switchTo().alert().accept();
  }
  @Test
  public void f() {
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
