package Maven_TestNG.Maven_Package;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
public class RegressionTest {
	
  WebDriver driver;

@Test(priority = 1)
  public void TC001() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	
	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 1: Sauce Labs Fleece Jacket");
	
  }
  
  @Test(priority = 2)
  public void TC002() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 2: Sauce Labs Backpack");
	
  }
  
  @Test(priority = 3)
  public void TC003() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	
	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 3: Sauce Labs Bolt T-Shirt");
	
  }

  @Test(priority = 4)
  public void TC004() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	
	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 4: Test.allTheThings() T-Shirt (Red)");
	
  }
  
  @Test(priority = 5)
  public void TC005() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	
	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 5: Sauce Labs Bike Light");
	
  }
  
  @Test(priority = 6)
  public void TC006() {
	  
	//Add Item to Cart
	driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
	
	//Add to Cart
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	
	//Click Checkout
	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	
	//Checkout Items
	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Test First Name");
	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Test Last Name");
	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("Test Zip Code");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	
	//Click Finish
	driver.findElement(By.cssSelector("button[id='finish']")).click();
	
	//Click Home
	driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
	
	//Print
	System.out.println("Executed: Test Case 6: Sauce Labs Onesie");
	
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	//Locate chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\TestNG\\Maven_TestNG\\server\\chromedriver.exe");
	driver = new ChromeDriver();
	
	//Maximize Browser
	driver.manage().window().maximize();
	
	//Delete Cookies from the browser.
	driver.manage().deleteAllCookies();

	//Set URL to the Browser
	driver.get("https://www.saucedemo.com/");
	
	//Wait for the elements to load.
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Input User name and Password
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	
	//Click Login
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

  }

  @AfterClass
  public void afterClass() {
	
	//Menu is Clicked.
	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	  
	//Menu - Logout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	
	//Quit the Drive
	driver.quit();
	
  }

}
