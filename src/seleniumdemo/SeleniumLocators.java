package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
 static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("http://www.hyderabadreport.com/user");
		/*Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("Kalyan");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("John@1234");
		driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.linkText("Greater News")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("News")).click();*/
       List<WebElement> totallinks = driver.findElements(By.tagName("a"));
       System.out.println("total number of links :"+ totallinks.size());
        
        
		
		

	}

}
