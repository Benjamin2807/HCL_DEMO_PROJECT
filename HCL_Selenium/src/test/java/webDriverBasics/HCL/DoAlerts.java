package webDriverBasics.HCL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoAlerts {
	@Test
	public void f() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Benjamin");
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Thread.sleep(3000);
		Alert alert3 =driver.switchTo().alert();
		String str = alert3.getText();
		System.out.println(str);
		alert3.accept();
		
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
