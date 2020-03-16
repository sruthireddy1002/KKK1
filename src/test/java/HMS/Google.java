package HMS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	 String str = driver.findElement(By.linkText("Gmail")).getText();
	 System.out.println(str);
	  
	
	 System.out.println(str);
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
