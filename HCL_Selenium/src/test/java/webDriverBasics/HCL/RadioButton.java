package webDriverBasics.HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
  
	@Test
  public void readioButton() throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[text()='Radio Button']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("yes")).click();
		System.out.println("Radio button clicked");
		Thread.sleep(3000);
        
		boolean str = driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected();
        System.out.println(str);
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("(//input[@name='age'])[3]")).click();
        System.out.println("Age clicked");
		driver.close();
		
  }
	
}
