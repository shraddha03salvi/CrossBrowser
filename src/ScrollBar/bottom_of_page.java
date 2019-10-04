package ScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bottom_of_page 

{
	
	WebDriver driver;
    @Test
    public void ByPage() throws Exception {
    	
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 // Launch the application		
	        driver.get("https://www.naukri.com/mnjuser/homepage?id=");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        
	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

}
