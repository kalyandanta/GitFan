package seleniumdemo;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


class Junit1 {
 static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
		
	}

	@Test
	void hyderabad() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517501");
		Thread.sleep(3000);
	//	new Select(driver.findElement(By.name("field-5gVECDat8HE4BHW"))).selectByVisibleText("Pakistan");
	//	new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByValue("IS");
		new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByIndex(7);
		


	}
@Test
void google() {
	driver.get("https://www.google.co.in/");
}
}


