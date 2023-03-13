package driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Driver {
	
	private static WebDriver driver;
	
	@Before
	public void beforeCenario() {
		
		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://blogdoagi.com.br/");
	}
	
	@After
	public void afterCenario() {
		
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
