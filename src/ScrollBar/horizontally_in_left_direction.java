package ScrollBar;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class horizontally_in_left_direction 
{
	
	WebDriver driver;
	 @Test
 public void left_Horizontal() throws Exception 
{
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	       // WebElement Element = driver.findElement(By.linkText("MOBILE TESTING"));
	        js.executeScript("window.scrollBy(-800,0)");
	        Thread.sleep(3000);
	        
       /* If you want to scroll horizontally in the right direction, use the following JavaScript.
	        ((JavascriptExecutor)

	        driver).executeScript(“window.scrollBy(2000,0)”);*/
 }
}
