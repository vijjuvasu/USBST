package testng;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j {
	WebDriver driver;
	
  @Test
  public void googleSearch() {
	  Logger log= Logger.getLogger("search");
	  PropertyConfigurator.configure("Log4j.properties");
	  driver = new ChromeDriver();
	  log.info("launch chrome browser");
	  driver.manage().window().maximize();
	  log.info("chrome browser maximize");
  }
}
