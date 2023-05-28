package screenshots;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.file.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {
	WebDriver driver;
	public void f() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\usbs\\screeshots\\Google_" + time + ".png"));
		

		
		
		
	}
  @Test
  public void screenshots() throws Exception {

		driver.get("https://google.com");
		Thread.sleep(2000);
		TakeScreenshot();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		TakeScreenshot();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		TakeScreenshot();
		
		

		

	
}
private void TakeScreenshot() {
	// TODO Auto-generated method stub
	
}
@BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  
  }

}
