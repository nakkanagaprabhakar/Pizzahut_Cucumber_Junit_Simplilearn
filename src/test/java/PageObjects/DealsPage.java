package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {
	public WebDriver driver;
	
	public DealsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By RadioButtonlocator = By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[1]/div/div/div/div/span[2]");
	By pizzaclicklocator = By.linkText("Pizzas");
	By addpizzalocator = By.xpath("//button[@data-synth='button--mexican-fiesta-recommended-pan-personal--one-tap']");
	By basketPizzalocator = By.xpath("//div[@data-synth=\"basket-item-type--pizza\"]");
	By checkoutpricelocator = By.cssSelector(".text-right");
	By checkoutbuttonTextlocator = By.xpath("//a[@href=\"/order/checkout/\"]");
	By itemTextlocator = By.cssSelector(".bg-green-dark");
	By DrinksClicklocator = By.linkText("Drinks");
	By pepsiClicklocator = By.xpath("//button[@data-synth=\"button--pepsi-600ml--one-tap\"]");
	By PizzaRemovelocator = By.xpath("//button[@data-synth=\"basket-item-remove--mexican-fiesta-recommended-pan-personal\"]");
	By CheckoutButtonClicklocator = By.xpath("//button[@data-synth=\"link--checkout\"]");
	By endMinimumpopuplocator = By.xpath("//h3/span");
	By popupcontinuelocator = By.xpath("//button[@data-synth=\"link--continue-shopping\"]");
	
	public String getDealsPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean Checkvegetarianradiobutton()
	{
		return driver.findElement(RadioButtonlocator).isSelected();
	}
	
	public void clickonPizza()
	{
		driver.findElement(pizzaclicklocator).click();
	}
	
	public void addPizza()
	{
		driver.findElement(addpizzalocator).click();
	}
	
	public boolean checkPizzaAddedBasket()
	{
		return driver.findElement(basketPizzalocator).isDisplayed();
	}
	
	public String CheckoutpriceWithPizza_Tax()
	{
		 return driver.findElement(checkoutpricelocator).getText();
	}
	
	public String getcheckoutbuttonText()
	{
		return driver.findElement(checkoutbuttonTextlocator).getText();
	}
	
	public String getitemText()
	{
		return driver.findElement(itemTextlocator).getText();
	}
	
	public void clickonDrinks()
	{
		driver.findElement(DrinksClicklocator).click();
	}
	
	
	public void ClickonPepsi()
	{
		driver.findElement(pepsiClicklocator).click();
	}
	
	public void PizzaRemove()
	{
		driver.findElement(PizzaRemovelocator).click();
	}
	
	public void clickCheckoutButton()
	{
		driver.findElement(CheckoutButtonClicklocator).click();
	}
	
	public String endMinimumpopup()
	{
		return driver.findElement(endMinimumpopuplocator).getText();

	}
	
	
	public void continueShoppingClick()
	{
		driver.findElement(popupcontinuelocator).click();
	}
	
	
	public String verifyNewPriceisGretter()
	{
		return driver.findElement(checkoutpricelocator).getText();			  
	}
	
	
	public boolean verifyPizzaRemovedFromBasket()
	{
//		driver.findElement(PizzaRemovelocator).isDisplayed();
		return false;
	}
	

}

















