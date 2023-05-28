package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.interactions.Actions;
public class Actionsclass {
	WebDriver driver;
  @Test(enabled=false)
  public void rightClick() throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(5000);
	  
	Actions act = new Actions(driver);
	act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-387-1\"]/a"))).build().perform();
	
  }
  @Test(enabled=false)
  public void doubleClick() throws Exception {
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(7000);
	 Actions act=new Actions(driver);
	 act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
  }
  @Test(enabled=false)
  public void dragAndDrop() throws Exception {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(8000);
	  Actions act= new Actions(driver);
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement target=driver.findElement(By.id("droppable"));
	  act.dragAndDrop(source, target).build().perform();
	  
  }
  @Test(enabled=false)
  public void mouseover() throws Exception {
	  driver.get("http://www.seleniumlearn.com/");
	  Thread.sleep(6000);
	  Actions act =new Actions(driver);
	  act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
	  Thread.sleep(3000);
	  act.moveToElement(driver.findElement(By.linkText("Interview Q&A"))).click().build().perform();
	  
  }
  
  @Test
  public void keyboardFunctions() throws Exception {
	  driver.get("https://redmine.org/login");
	  Thread.sleep(3000);
	  Actions act= new Actions(driver);
	  act.sendKeys(Keys.TAB).build().perform();
	  
	 
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
