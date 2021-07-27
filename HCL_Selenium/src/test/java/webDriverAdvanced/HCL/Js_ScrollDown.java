package webDriverAdvanced.HCL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js_ScrollDown {
 
	@Test
  public void Js_scrolldown() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,500)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-500)");
		
		WebElement element1 = driver.findElement(By.xpath("(//img[@src='images/img5.jpg'])[1]"));
		WebElement element2 = driver.findElement(By.xpath("(//img[@src='images/img4.jpg'])[1]"));
		WebElement element3 = driver.findElement(By.xpath("(//input[@value='input'])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",element1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);",element3);
		Thread.sleep(3000);
		
		element3.clear();
		element3.sendKeys("Benjamin");
		
		Thread.sleep(3000);
		driver.close();
  }
}
