package Browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassConcept {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Robot r = new Robot();
         r.keyPress(KeyEvent.VK_CONTROL);
         Thread.sleep(3000);
         r.keyPress(KeyEvent.VK_T);
         Thread.sleep(3000);
         r.keyRelease(KeyEvent.VK_CONTROL);
         Thread.sleep(3000);
         r.keyRelease(KeyEvent.VK_T);
         Thread.sleep(3000);
          driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		// press ALT key from keyboard
		r.keyPress(KeyEvent.VK_ALT);
		// press F key from keyboard
		r.keyPress(KeyEvent.VK_F);
		// Release F key from keyboard
		r.keyRelease(KeyEvent.VK_F);
		// Release Alt key from keyboard
		r.keyRelease(KeyEvent.VK_ALT);
		r.mouseMove(810, 150);
		Thread.sleep(3000);
		// Press W key from keyboard to open a new private window
	r.keyPress(KeyEvent.VK_W);
		// Release W key from keyboard
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.close();
	}
}
