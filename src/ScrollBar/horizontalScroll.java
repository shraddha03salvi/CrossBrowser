package ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class horizontalScroll 
{
	WebDriver driver;
    @Test
    public void ScrollHorizontally() throws InterruptedException 
    
    {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		// Launch the application		
	        driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        WebElement Element = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the page Horizontally till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        Thread.sleep(3000);
	        
	        //js.executeScript("window.scrollBy(2000,0)"); => This is another option for horizontal scroll
	        //Thread.sleep(3000);
	       
    }
	
	

}
