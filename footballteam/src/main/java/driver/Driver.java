package driver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	private static final String CHROME_PROPERTY_NAME = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_EXE = "chromedriver.exe";
	private static final String PROJECT_DIR = System.getProperty("user.dir");
	
	public static WebDriver getWebDriver() throws Exception {
		
		WebDriver driver = null;
		
			prepareDriver(CHROME_PROPERTY_NAME, CHROME_DRIVER_EXE);
			driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		return driver;
	}
	
	private static void prepareDriver(String propertyName, String driverExe) throws IOException {
			System.setProperty(propertyName, PROJECT_DIR +  File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "webdrivers" + File.separator + driverExe);
	}
}
