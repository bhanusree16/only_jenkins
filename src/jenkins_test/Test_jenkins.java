package jenkins_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


/**
 * @author jagan
 *
 */

public class Test_jenkins {
	@Test
	public void test1()
	{
		System.out.println("welcome to jenkins world");
		
		System.setProperty("webdriver.gecko.driver", "C:/eclipse/Drivers/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
