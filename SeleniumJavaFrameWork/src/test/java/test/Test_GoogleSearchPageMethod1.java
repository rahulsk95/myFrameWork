package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageMethod1;

public class Test_GoogleSearchPageMethod1 {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}

	public static void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		GoogleSearchPageMethod1.textbox_search(driver).sendKeys("Selenium Automation");
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		GoogleSearchPageMethod1.textbox_search(driver).sendKeys(Keys.RETURN);	
		
		driver.close();

	}
}
