package firstdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Launchchrome {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void test1() throws InterruptedException {
	driver.get("https://google.com");
	Thread.sleep(3000);
	
	}
	@Test 
	void test2() {
	driver.get("https://www.ndtv.com");
	driver.findElement(By.linkText("Imran Khan's Supporters Attack Pak PM Shehbaz Sharif's House")).click();
	}
	
	@Test
	void test3() {
	driver.get("https://www.ndtv.com");
driver.findElement(By.xpath("//*[@id=\"header2\"]/div/div/div/div/div[2]/a[1]")).click();
			
	

	}
}