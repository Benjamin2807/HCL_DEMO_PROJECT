package webDriverBasics.HCL;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
 
	
	@Test
  public void windowHandling() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		Thread.sleep(3000);
		Set<String> windows = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(windows);
		driver.switchTo().window(listWindows.get(1));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(listWindows.get(0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Thread.sleep(3000);
		
		Set<String> windows1 = driver.getWindowHandles();
		List<String> listWindows1 = new ArrayList<String>(windows1);
		
		int size = listWindows1.size();
		System.out.println(size);
		
		for(int i =size-1; i>0; i--)
		{ 
			driver.switchTo().window(listWindows1.get(i));
			Thread.sleep(3000);
			driver.close();
		}
		
		
		
	
		
		
  }
}
