package webDriverBasics.HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFields {
 
	
	@Test
  public void textfields() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image']")).click();
		
		driver.findElement(By.id("email")).sendKeys("benjaminpremkumar23@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Benjamin");
		String str = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(str);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following::input")).clear();
		boolean str1= driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).isEnabled();
		System.out.println(str1);
		driver.close();
  }
}
