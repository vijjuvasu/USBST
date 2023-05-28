package Sikuli;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Desktopautomation {
	WebDriver driver;
	
	Screen s=new Screen();
  @Test
  public void f() throws FindFailed {
	  s.click("C:\\sikuli\\start.PNG");
  }
}
