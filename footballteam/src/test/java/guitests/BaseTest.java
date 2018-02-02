package guitests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import driver.Driver;

public class BaseTest {

	@BeforeClass
	public static void setUp() throws Exception{
		WebDriver driver = Driver.getWebDriver();
		driver.get("http://google.com");
	}
}
