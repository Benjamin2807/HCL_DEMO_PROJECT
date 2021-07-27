package webDriverBasics.HCL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	@Test
	public void buttons() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();

		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		Point str = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println(str);

		String str1 = driver.findElement(By.cssSelector("button[style='background-color:lightgreen']")).getCssValue("background-color");
		System.out.println(str1);

		Dimension str2 = driver.findElement(By.id("size")).getSize();
		System.out.println(str2);
		driver.close();
	}
}
