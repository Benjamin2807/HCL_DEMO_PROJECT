package webDriverAdvanced.HCL;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {
  
	@Test
  public void getScreenshot() throws InterruptedException, IOException, AWTException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 1']]"));
		int y = driver.findElement(By.xpath("//li[text()[normalize-space()='Item 4']]")).getLocation().getY();
		
		Thread.sleep(3000);
		action.dragAndDropBy(element, 0, y-200).build().perform();
		Thread.sleep(3000);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./SnapShots/Normalsnap1.jpg");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		
		
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screenSize);
		BufferedImage image = robot.createScreenCapture(rect);
		File destination = new File("./SnapShots/RobotScreenshot.jpg");
		ImageIO.write(image, "jpg", destination);
		
		Thread.sleep(3000);
		driver.close();
  }
}
