package Robot_class;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./driver/gecko.exe");
		
		
		FirefoxProfile profile = new FirefoxProfile();
		
		// Set preferences for file type
		profile.setPreference("browser.helperApps.neverAsk.openFile","application/octet-stream");
		
	}

}
