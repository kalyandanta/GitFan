package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser1 {
	static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.quit();
	
	
	
		
	
	
	

	
	}

}
