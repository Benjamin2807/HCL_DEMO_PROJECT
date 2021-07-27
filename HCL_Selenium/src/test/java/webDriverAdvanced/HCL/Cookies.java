package webDriverAdvanced.HCL;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookies {
  
	@Test
  public void learnCookies() throws InterruptedException, IOException 
  {
		 
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
             
        /*Cookie name = new Cookie("loginData", "565789000");
        driver.manage().addCookie(name);
        System.out.println("cookie added");
        Thread.sleep(3000);
        driver.manage().deleteCookieNamed("loginData");
        driver.manage().deleteAllCookies();*/
     
               
        File file  = new File("D:\\HCL Training Assignments\\CookieFoler\\Cookie.data");
		file.createNewFile();
        FileWriter writer = new FileWriter(file);
		BufferedWriter Buff = new BufferedWriter(writer);
        
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
           
        	Buff.write(getcookies.getName()+" ;" +getcookies.getDomain()+" ;" +getcookies.getExpiry());
        	Buff.newLine();
        	
        }
  
        Buff.close(); writer.close();
  
  }
	
}
	  
  

