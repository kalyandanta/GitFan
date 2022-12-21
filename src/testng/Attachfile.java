package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Attachfile {
	WebDriver driver;
	
  @Test
  public void attachFile() throws InterruptedException {
	  driver.get("https://express.adobe.com/tools/image-resize/");
	  Thread.sleep(10000);
	  
	  driver.findElement(By.xpath("//*[@id=\"quick-task-container\"]/cclqt-resize-image//sp-theme/cclqt-workspace/cclqt-image-upload//div/sp-dropzone/div[2]/button")).sendKeys("C:\\Users\\dshan\\Downloads\\kalyan.jpg");
  }
	
  @Test
  public void attachFile2() throws InterruptedException {
	  driver.get("http://baalabharathi.com/upload-story/");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("D:\\demo.PNG");
	  }
	 
	  
	  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
