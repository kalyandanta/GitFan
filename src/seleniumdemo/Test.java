package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.co.in/");
		  driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
		  
		  

	}

}
