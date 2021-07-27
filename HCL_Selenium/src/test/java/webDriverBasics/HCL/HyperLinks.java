package webDriverBasics.HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {
  
	@Test
  public void hyperLinks() throws InterruptedException 
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		System.out.println("Clicked first Link");
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		System.out.println("Clicked Second Link");
		
		driver.findElement(By.xpath("//img[@alt='logo Testleaf']")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		
		driver.findElement(By.xpath("(//a[@link='blue'])[3]")).click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		System.out.println("Clicked Last Link");
		
		driver.findElement(By.xpath("//a[@href='error.html']")).click();
		System.out.println("Clicked Broken Link");
		driver.close();
	
	}
}
