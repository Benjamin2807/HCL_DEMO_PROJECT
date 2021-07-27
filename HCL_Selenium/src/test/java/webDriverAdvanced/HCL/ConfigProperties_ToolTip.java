package webDriverAdvanced.HCL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigProperties_ToolTip {

	@Test
	public void config_properties_ToolTip() throws IOException, InterruptedException, AWTException 
	{

		FileInputStream file = new FileInputStream("/HCL_Selenium/src/test/java/config.properties");		
		Properties prop = new Properties();
		prop.load(file);

		String bname = prop.getProperty("browser");
		String path = prop.getProperty("path");

		if(bname.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("wedriver.chrome.driver", path);
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.leafground.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(5000);

			driver.findElement(By.xpath("//img[@alt='tooltip']")).click();
			Thread.sleep(3000);
			String attribute = driver.findElement(By.id("age")).getAttribute("title");
			System.out.println(attribute);
			Thread.sleep(3000);
			
		}


		else if(bname.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", path);
		}

		else
		{
			System.setProperty("webdriver.ie.driver", path);
		}


	}
}
