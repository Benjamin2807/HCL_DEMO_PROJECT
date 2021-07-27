package webDriverAdvanced.HCL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_Download {
  
	@Test
  public void upload_Download() throws InterruptedException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath("//img[@alt='Download']")).click();
		driver.findElement(By.linkText("Download Excel")).click();
		Thread.sleep(3000);
		
		
		File file = new File("C:\\Users\\user\\Downloads");
		File[] list_files = file.listFiles();
		
		
		for(File getFile : list_files)
		{
			if(getFile.getName().equalsIgnoreCase("testleaf.xlsx"))
			{
			    
				System.out.println(getFile.getName()+ " File Successfully Downloaded");
			}
			
			
		}
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_excel");

		
		driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		Thread.sleep(3000);
		/*WebElement clickInfo = driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(clickInfo);
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", clickInfo);*/

		String filelocation = "C:\\Users\\user\\Downloads\\51957995.pdf";
		StringSelection select = new StringSelection(filelocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		driver.close();
		
		
  }
}
