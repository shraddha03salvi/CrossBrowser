package WebTable_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoadvanceDatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
		Thread.sleep(3000);
 List<WebElement> dates =driver.findElements(By.xpath("//div[@id='rb-calendar-onward-cal']/table//td"));
		int total_node = dates.size();
		for(int i=0; i<total_node;i++) {
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("30")) 
			{
				dates.get(i).click();
				break;
			}
		}
	}

}
