package HMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Hdfc {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
		/*
		 * // driver.findElement(By.
		 * xpath("//button[@class='offer-knowmore at-element-click-tracking']")).click()
		 * ; Thread.sleep(3000);
		 * 
		 * driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys(
		 * "sruthireddy1002");
		 * 
		 * driver.findElement(By.xpath("//table[@class='lForm']//tbody//tr//td//a//img")
		 * ).click();
		 * driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys(
		 * "dad1002");
		 * 
		 * driver.findElement(By.xpath("//input[@id='chkrsastu']")).click();
		 * driver.findElement(By.xpath("//img[@alt='Login']")).click();
		 */
		/*
		 * Actions action= new Actions(driver);
		 * 
		 * 
		 * WebElement ele = driver.findElement(By.
		 * xpath("//ul[@id='menu-1-9725c2b']//a[@class='elementor-item elementor-item-active'][contains(text(),'Interview Q & A')]"
		 * )); action.moveToElement(ele).build().perform();
		 * 
		 */
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium workspace\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.softwaretestingmaterial.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	driver.close();
	  
	  
  }

}
