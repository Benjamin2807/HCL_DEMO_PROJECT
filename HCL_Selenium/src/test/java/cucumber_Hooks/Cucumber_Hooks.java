package cucumber_Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_StepDefs.Base_Class;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Hooks extends Base_Class 
{
 
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
}
