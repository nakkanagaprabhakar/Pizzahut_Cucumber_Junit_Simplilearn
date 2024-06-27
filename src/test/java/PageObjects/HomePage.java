package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	public WebElement blackpopup;
	public WebElement addressSearch;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	By blackpopuplocator = By.cssSelector(".icon-close--white");
	By addressSearchlocator = By.cssSelector("[placeholder=\"Enter your location for delivery\"]");
	By dropdownoptionslocator = By.cssSelector("div.flex button");
	
	
	public WebElement blackpopupScreen()
	{
		return driver.findElement(blackpopuplocator);
	}
	
	public void closeblackpopupScreen()
	{
		blackpopupScreen().click();
	}
	
	public WebElement locationenterbox() 
	{
		return driver.findElement(addressSearchlocator);
	}
	
	public void Typeaddress(String DelLocation)
	{
		locationenterbox().sendKeys(DelLocation);
	}
	
	public void SelectadressfromDropDown()
	{
		List<WebElement> options = driver.findElements(dropdownoptionslocator);
		for(int i=1;i<=options.size();i++)
		{
			String text = options.get(i).getText();
			if(text.contains("LuLu Mall Hyderabad"))
			{
				options.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
}















