package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class popup {
	WebDriver driver;
	
  @Test
  public void ok() throws Exception {
	  driver.get("https://www.stechies.com/code-examples/Alert-Message-PHP-JavaScript-alert.php");
	  Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  
  }
  
  @Test
  public void cancel(){
	  driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
	driver.switchTo().alert().dismiss();
	
  }
  
  @Test
  public void Textandok() {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Alert a=driver.switchTo().alert();
	  a.sendKeys("kalyan");
	  a.accept();
	 
    
	  
  }
  
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
