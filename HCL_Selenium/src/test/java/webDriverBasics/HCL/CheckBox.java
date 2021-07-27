package webDriverBasics.HCL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
 
	@Test
  public void checkBox() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='example']//div/input")).click();
		System.out.println("Checked Java");
		Thread.sleep(3000);
		
		boolean str = driver.findElement(By.xpath("//div[@class='example'][2]//div/input")).isSelected();
		System.out.println(str);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='example'][3]//div/following-sibling::div/input")).click();
		System.out.println("Unchecked");
		Thread.sleep(3000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='example'][4]/div/input"));
		int size = elements.size();
		for(int i =0; i<size; i++)
		{
			elements.get(i).click();
		}
		
		System.out.println("Clicked all boxes");
		driver.close();
  }
}
