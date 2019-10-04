package ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class visibility_of_element {
	
	
	WebDriver driver;
	 @Test
	 public void ByVisibleElement() throws Exception 
	 {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        //Launch the application		
	        driver.get("https://www.naukri.com/mnjuser/homepage?id=");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
		 //Find element by link text and store in variable "element" 
	        WebElement element = driver.findElement(By.linkText("Register Now"));
	        Thread.sleep(5000);
	        //This will scroll the page till the element is found	
	     js.executeScript("arguments[0].scrollIntoView;",element);
	     Thread.sleep(2000);
		 
	 }

}
