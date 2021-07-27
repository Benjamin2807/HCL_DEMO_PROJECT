package webDriverBasics.HCL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {


	@Test
	public void mouseActions() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//img[@alt='mouseover']")).click();
		WebElement ele = driver.findElement(By.linkText("TestLeaf Courses"));
		action.moveToElement(ele).build().perform();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='pages/drag.html']")).click();
		Thread.sleep(3000);
		WebElement drag = driver.findElement(By.id("draggable"));
		action.dragAndDropBy(drag, 50, 0).build().perform();
		action.release();
        driver.navigate().back();
        Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@alt='drop']")).click();
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag1, drop).build().perform();
 
		Thread.sleep(3000);
		driver.close();

	}
}
