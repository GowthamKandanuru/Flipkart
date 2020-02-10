package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox {
	
	@FindBy (xpath = "//input[@title = 'Search for products, brands and more']")
	public WebElement searchbox;
	
	@FindBy (xpath = "//div[@class='_3ywJNQ']/div[text()='Price -- High to Low']")
	public WebElement text;
	
	@FindBy (xpath = "//div[@class='_3UEiDE']/span")
	public WebElement results;
}
