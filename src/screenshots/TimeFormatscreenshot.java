package screenshots;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.File;
import java.text.DateFormat;

public class TimeFormatscreenshot {
	WebDriver driver;
	private 
	
	 public void screenshot() {
		 DateFormat dateFormat= new SimpleDateFormat("YYYY_MMM_dd_HH_ss");
		 Date date=new Date();
		 String time = dateFormat.format(date);
		 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\screenshots\\google+ time" + ".png"));

		 
		 
	 
	 }
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
