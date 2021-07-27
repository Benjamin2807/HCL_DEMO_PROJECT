package webDriverAdvanced.HCL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Js_DatePicker {
	@Test
	public void Js_datePicker() throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datepicker1').value='28/07/1996'");
		Thread.sleep(3000);

		js.executeScript("document.getElementById('datepicker2').value='28/07/1996'");
		Thread.sleep(3000);
		driver.close();

	}
}
