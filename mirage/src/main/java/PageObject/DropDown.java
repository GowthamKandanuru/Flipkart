package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDown {
	
	@FindBy(xpath="//div/a[@class='_2SvCnW'][1]")
	public WebElement obj;
	
	@FindBy(xpath = "//div[@class='_1qKb_B']/select[@class='fPjUPw']")
	public WebElement dropdown;

}
