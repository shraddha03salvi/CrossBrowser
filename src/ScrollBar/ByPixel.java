package ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ByPixel {

	 WebDriver driver;
	 @Test
	 public void Bypixel() throws Exception 
	 {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 JavascriptExecutor js = ( JavascriptExecutor)driver;
		 //Launch the Application
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		  // This  will scroll down the page by  1000 pixel vertical.Syntax: executeScript("window.scrollBy(x-pixels,y-pixels)");
		 
	      js.executeScript("window.scrollBy(0,3000)");
	      Thread.sleep(3000);
	 }

}
