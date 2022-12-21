package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testng2 {
	private static final String menus = null;
	private static final String signin = null;
	WebDriver driver;
	
  @Test(priority=1,enabled=false)
  public void facebook() {
	  driver.get("https://www.facebook.com/");
  }
  @Test(priority=2,enabled=false)
  public void method2() {
	  
	  	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("tirupati"+Keys.ENTER);
	  	  
	  
	  
  }
  @Test(enabled=false)
  public void gmail() {
	  driver.get("https://www.gmail.com/");
  }
  @Test(enabled=false)
  public void method1() {
	  driver.get("https://www.google.co.in/");
  }
  @Test(priority=1,description="menus",enabled=false)
  public void test1() {
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[9]/a")).click();
  
  }
  @Test(priority=0,description="signin",timeOut=1000)
  public void test2() {
	driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kalyan");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("prabhas@123");
	driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();
	
	  
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
