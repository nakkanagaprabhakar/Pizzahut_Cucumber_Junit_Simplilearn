package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public HomePage hp;
	public DealsPage dp;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public HomePage getHomePage()
	{
		hp = new HomePage(driver);
		return hp;
	}
	
	public DealsPage getDealsPage()
	{
		dp = new DealsPage(driver);
		return dp;
	}

}
