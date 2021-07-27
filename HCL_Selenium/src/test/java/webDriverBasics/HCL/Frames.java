package webDriverBasics.HCL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	@Test
	public void f() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);


		
		WebElement element = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("Click")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		WebElement element1 = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(element1);
		
		WebElement element2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(element2);
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		List<WebElement> element3 = driver.findElements(By.tagName("iframe"));
		int size = element3.size();
		System.out.println("No of Frames is "+size);
		
	
	}
}
