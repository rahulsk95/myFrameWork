import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().version("2.36").setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
	}
}
