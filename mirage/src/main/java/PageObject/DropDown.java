package PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class DropDown {
	
	@FindBy(xpath="//div/a[@class='_2SvCnW'][1]")
	public WebElement obj;
	
	@FindBy(xpath = "//select[@class='fPjUPw']")
	public WebElement dropdown;
	
	@FindBy(xpath="//div[@class='_3ywJNQ']/div[3]")
	public WebElement sort;
	
	@FindBy(xpath="//a[@class='_2Xp0TH'][text()=2]")
	public WebElement nav;

}
