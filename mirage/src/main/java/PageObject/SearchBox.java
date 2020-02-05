package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox {
	
	@FindBy (xpath = "//input[@title = 'Search for products, brands and more']")
	public WebElement searchbox;
}
