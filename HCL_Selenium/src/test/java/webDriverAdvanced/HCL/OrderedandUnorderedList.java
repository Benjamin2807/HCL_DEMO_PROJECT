package webDriverAdvanced.HCL;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderedandUnorderedList {


	@Test
	public void orderedAndUnordered_List() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		List<WebElement> element = driver.findElements(By.xpath("//ol[@id='selectable']/li"));

		Actions action = new Actions(driver);


		action.keyDown(Keys.CONTROL).click(element.get(0))
		.click(element.get(4)).build().perform();
		action.release();
		Thread.sleep(3000);
		driver.close();


		/*driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.id("searchbox")).sendKeys("ch");
		Thread.sleep(3000);
		List<WebElement> element1 = driver.findElements(By.xpath("//div[@id='menucontainer']/ul/li"));
		int size1 = element1.size();
		System.out.println(size1);

		for(int i=0; i<size1; i++)
		{
			if(element1.get(i).getText().equalsIgnoreCase("French Polynesia"))
			{
				String str = element1.get(i).getText();
				element1.get(i).click();
				System.out.println("Element clicked is " +str);
			}

			else
			{
				continue;
			}

		}

		Thread.sleep(3000);
		driver.close()*/;
	}
}
