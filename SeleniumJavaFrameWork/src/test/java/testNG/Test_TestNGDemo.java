package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageMethod2;

public class Test_TestNGDemo {

	private static WebDriver driver = null;
	String baseUrl;
	GoogleSearchPageMethod2 sop;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		sop = new GoogleSearchPageMethod2(driver);

	}

	@Test
	public void test() {
		driver.get(baseUrl);
		sop.setTextInSearchBox("Selenium Automation");
		sop.clickSearchButton();

	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
