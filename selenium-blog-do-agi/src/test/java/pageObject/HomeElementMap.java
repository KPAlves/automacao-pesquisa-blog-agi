package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementMap {
	
	
	protected String home_title = driver.Driver.getDriver().getTitle();
	
	@FindBy(id = "search-open")
	protected WebElement search_open;
	
	@FindBy(className = "search-field")
	protected WebElement search_field;
	
	@FindBy(className = "search-submit")
	protected WebElement search_submit;
}
