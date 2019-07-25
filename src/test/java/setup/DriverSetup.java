package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverSetup {
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "G:\\Selective\\Browser Driver\\chromedriver2.35\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	return driver;
	}
	
	
}
