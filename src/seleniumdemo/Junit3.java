package seleniumdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Junit3 {
 static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.diver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void test() throws Exception {
		/*driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("pavan");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-pass")).sendKeys("HelloWorld");
		Thread.sleep(3000);
		//driver.findElement(By.id("edit-pass")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("Venkatesh");*/
		/*driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("kalyan");
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).clear();*/
		
		
	//	driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("hello@143"+Keys.ENTER);
		
		//Thread.sleep(2000);//
		//driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(Keys.ENTER);
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kalyan");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("prabhas");
		driver.findElement(By.name("pass")).sendKeys("prabhas"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kalyan");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("prabhas");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hello@143"+Keys.ENTER);*/
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		/*new Select(driver.findElement(By.xpath("//*[@id=\"day\"]"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath("//*[@id=\"month\"]"))).selectByValue("3");
		new Select(driver.findElement(By.xpath("//*[@id=\"year\"]"))).selectByVisibleText("2018");*/
		new Select(driver.findElement(By.name("birthday_day"))).selectByValue("3");
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	}
	
		
	
		
	}


