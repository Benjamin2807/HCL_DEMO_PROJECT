package webDriverAdvanced.HCL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomAttributesTest extends PomAttributes{
  
	String User = "DemoSalesManager";
	String pwd = "crmsfa";
	
	@Test
  public void PomImplementation() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		username(driver).sendKeys(User);
		password(driver).sendKeys(pwd);
		submit(driver).click();
		
		Thread.sleep(3000);
		driver.close();
		
  }
}
