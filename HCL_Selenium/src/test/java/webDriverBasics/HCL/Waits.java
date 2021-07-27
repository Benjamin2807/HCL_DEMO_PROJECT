package webDriverBasics.HCL;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import reactor.core.Exceptions;

public class Waits {

	@Test
	public void waits() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//ExplicitWait
		WebElement element = driver.findElement(By.xpath("//button[@id='btn']//b[1]"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
		/*FluentWait

		WebElement element1 = driver.findElement(By.xpath("//button[@id='btn']//b[1]"));
		         Wait wait1 = new FluentWait(driver)
                            .withTimeout(Duration.ofSeconds(20))
                            .pollingEvery(Duration.ofSeconds(10))
                            .ignoring(Exceptions.class);
                            wait1.until(ExpectedConditions.visibilityOf(element1));   */
				
		String text = driver.findElement(By.xpath("//button[@id='btn']//b[1]")).getText();
		System.out.println(text);

		
	}
}
