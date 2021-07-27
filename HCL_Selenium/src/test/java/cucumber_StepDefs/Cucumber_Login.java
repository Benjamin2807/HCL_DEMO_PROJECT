package cucumber_StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber_Hooks.Cucumber_Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Cucumber_Login {

	
	
	WebDriver driver;
	
	@Given("Open the Browser and navigate to LeafTaps")
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@When("Enter the Username")
	public void enterusername()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@And("Enter the  Password")
	public void enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("democsr");
	}


	@Then("Verify Login Successful")
	public void assertLogin()
	{

	}
}
