package sikuli;

import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class DesktopApplication {
	Screen s=new Screen();
	
  @Test
  public void Desktop() throws FindFailed {
	  s.click("D:\\Start.PNG");
  }
  
  @Test
  public void Desktop2() throws FindFailed {
	 
	  s.click("C:\\Users\\dshan\\OneDrive\\Pictures\\IE.png");
	  
	  
	  
	  
  }
  
 

}
