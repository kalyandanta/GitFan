package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Msedge2 {
	static WebDriver driver;
	public static void main(String[] args) throws Exception{
		
   System.setProperty("webdriver.edge.driver", "C:\\Users\\dshan\\OneDrive\\Documents\\Lib\\edgedriver.exe");
   driver=new EdgeDriver();
   Thread.sleep(2000);
   driver.get("https://www.facebook.com");
   
   
   
   
   
   
   
   
   
		
	}
	

}
