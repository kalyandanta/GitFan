package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Launchmsedge {
	static WebDriver driver;
	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.geko.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\gekodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
	Thread.sleep(2000);
driver.get("https://www.google.com");
driver.quit();


		
		
		
		
		
		

		

	}

}
