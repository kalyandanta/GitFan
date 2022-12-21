package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
static WebDriver driver;

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.drivver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://hyderabadreport.com/user");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("kalyan");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("khanna");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
	
	
	

	}

}
