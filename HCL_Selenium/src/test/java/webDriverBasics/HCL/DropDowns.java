package webDriverBasics.HCL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
	@Test
	public void dropDowns() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		Thread.sleep(3000);

		Select select1 = new Select(driver.findElement(By.id("dropdown1")));
		select1.selectByIndex(1);
		System.out.println("Completed first drop down");
		Thread.sleep(3000);

		Select select2 = new Select(driver.findElement(By.name("dropdown2")));
		select2.selectByVisibleText("Selenium");
		System.out.println("Completed Second drop down");
		Thread.sleep(3000);

		Select select3 = new Select(driver.findElement(By.id("dropdown3")));
		select3.selectByValue("1");
		System.out.println("Completed Third drop down");
		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
		System.out.println(elements.size());
		Thread.sleep(3000);

		Select select4 = new Select(driver.findElement(By.xpath("//div[@class='example'][5]/select")));
		select4.selectByValue("1");
		System.out.println("Completed Fifth drop down");
		Thread.sleep(3000);

		Select select5 = new Select(driver.findElement(By.xpath("//div[@class='example'][6]/select")));
		select5.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		select5.selectByVisibleText("Appium");
		Thread.sleep(3000);
		driver.close();

	}
}
