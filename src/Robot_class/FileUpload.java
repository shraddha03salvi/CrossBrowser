package Robot_class;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
	driver.manage().window().maximize();
	driver.findElement(By.id("usernameField")).sendKeys("dhatavkarshraddha@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("passwordField")).sendKeys("shraddhacom");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"attachCV\"]")).click();
	Thread.sleep(3000);
	Robot robot = new Robot();
	StringSelection string = new StringSelection("E:\\All pdf Files\\shraddha CV1.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string,null);
	robot.setAutoDelay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}
	
}
