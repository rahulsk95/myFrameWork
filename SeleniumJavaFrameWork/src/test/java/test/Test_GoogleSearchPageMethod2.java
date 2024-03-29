package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageMethod2;

public class Test_GoogleSearchPageMethod2 {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearchTest();
	}

	public static void googleSearchTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");

		GoogleSearchPageMethod2 sop = new GoogleSearchPageMethod2(driver);
		
		sop.setTextInSearchBox("Selenium Automation");
		sop.clickSearchButton();
		
		driver.get("https://www.google.com");
	}
}
