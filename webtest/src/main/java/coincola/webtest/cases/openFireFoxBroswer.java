package coincola.webtest.cases;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class openFireFoxBroswer {
	WebDriver driver;
	String testurl = "http://www.gxgg.gov.cn/";

	@Test
	public void test() {
		System.out.println("testing");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("start");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\webtest\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(testurl);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("over");
	}

}
