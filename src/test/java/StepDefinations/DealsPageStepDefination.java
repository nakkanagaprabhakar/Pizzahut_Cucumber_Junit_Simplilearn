package StepDefinations;

import org.openqa.selenium.By;

import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DealsPageStepDefination {
	public TextContextSetup tcs;
	public String checkoutbuttonText;
	public String pizzaamount;
	

	public DealsPageStepDefination(TextContextSetup tcs)
	{
		this.tcs = tcs;
	}
	
	
	@When("User navigate to deails page")
	public void user_navigate_to_deails_page() {
		String dealspageTitle = tcs.pom.getDealsPage().getDealsPageTitle();
		Assert.assertEquals(dealspageTitle, "Online Pizza Order, Pizza Deals, Pizza Hut Online Orders | Pizza Hut India");

	}
	
	@Then("User validate vegetarian radio button flag is off")
	public void user_validate_vegetarian_radio_button_flag_is_off() {
	
		System.out.println(tcs.pom.getDealsPage().Checkvegetarianradiobutton());
		Assert.assertFalse(tcs.pom.getDealsPage().Checkvegetarianradiobutton());

	}
	
	@Then("User clicks on Pizzas menu bar option")
	public void user_clicks_on_pizzas_menu_bar_option() throws InterruptedException {
		tcs.pom.getDealsPage().clickonPizza();
		Thread.sleep(2000);                          // for UI appear purpose

	}
	
	@When("User select add button of any pizza from Recommended")
	public void user_select_add_button_of_any_pizza_from_recommended() {
		tcs.pom.getDealsPage().addPizza();

	}
	
	@Then("User see that the pizza is getting added under Your Basket")
	public void user_see_that_the_pizza_is_getting_added_under_your_basket() {
		System.out.println(tcs.pom.getDealsPage().checkPizzaAddedBasket());
		Assert.assertTrue(tcs.pom.getDealsPage().checkPizzaAddedBasket());
	}
	
	@Then("User validate pizza price plus Tax is checkout price")
	public void user_validate_pizza_price_plus_tax_is_checkout_price() {
		String amount = "350.70";
		pizzaamount = tcs.pom.getDealsPage().CheckoutpriceWithPizza_Tax();
		if(pizzaamount.contains(amount))
		{
			System.out.println("amount is same and euqal = 350.70");
		}

	}
	
	@Then("User validate checkout button contains Item count")
	public void user_validate_checkout_button_contains_item_count() {
		checkoutbuttonText = tcs.pom.getDealsPage().getcheckoutbuttonText();
		String itemText = tcs.pom.getDealsPage().getitemText();
		Assert.assertTrue(checkoutbuttonText.contains(itemText));
		System.out.println("checkout button contains no of items = 1 item added");

	}
	
	@Then("User validate checkout button contains total price count")
	public void user_validate_checkout_button_contains_total_price_count() {
		Assert.assertTrue(checkoutbuttonText.contains(pizzaamount));
		System.out.println("checkout button contains total price count = 350.70");

	}
	
	@Then("User clicks on Drinks option")
	public void user_clicks_on_drinks_option() throws InterruptedException {
		tcs.pom.getDealsPage().clickonDrinks();
		Thread.sleep(2000);                         // for UI appear purpose

	}
	
	@Then("User select Pepsi option to add into the Basket")
	public void user_select_pepsi_option_to_add_into_the_basket() {
		tcs.pom.getDealsPage().ClickonPepsi();

	}
	
	@Then("User see {string} are showing under checkout button")
	public void user_see_items_are_showing_under_checkout_button(String items) {
		String TwoitemsText = items;
		Assert.assertEquals(TwoitemsText, tcs.pom.getDealsPage().getitemText());
		System.out.println("2 items are present in checkout button");

	}
	
	@Then("User see total price is now more than before")
	public void user_see_total_price_is_now_more_than_before() {
		
		String pizzaPepsiAmount = tcs.pom.getDealsPage().verifyNewPriceisGretter();    // ₹410.56
		if(Double.parseDouble(pizzaPepsiAmount.replace("₹", ""))  >  Double.parseDouble(pizzaamount.replace("₹", "")))       // "₹410.56" > "₹350.70"   >>>   410.56 > 350.70
		{
			System.out.println("pizza + pepsi amount bigger  = 410.56");
		}

		
	}
	
	@Then("User remove the Pizza item from Basket")
	public void user_remove_the_pizza_item_from_basket() {
		tcs.pom.getDealsPage().PizzaRemove();

	}
	
	@Then("see Price tag got removed from the checkout button")
	public void see_price_tag_got_removed_from_the_checkout_button() {
		System.out.println(tcs.pom.getDealsPage().verifyPizzaRemovedFromBasket());
		Assert.assertFalse(tcs.pom.getDealsPage().verifyPizzaRemovedFromBasket());      // Getting no such element present error means that pizza item got removed from basket, so locator not found, that's why no such element error came = The code and Assortion is correct and working properly
	}
	
	@Then("User see {string} showing in checkout button")
	public void user_see_item_showing_in_checkout_button(String item) {
		String oneitemText = item;
		Assert.assertEquals(oneitemText, tcs.pom.getDealsPage().getitemText() );
		System.out.println("1 item present in checkout button");

	}
	
	@Then("User Clicks on Checkout button")
	public void user_clicks_on_checkout_button() throws InterruptedException {
		tcs.pom.getDealsPage().clickCheckoutButton();
		Thread.sleep(2000);                                 // for UI appear purpose

	}
	
	@Then("User see minimum order required pop up is getting displayed")
	public void user_see_minimum_order_required_pop_up_is_getting_displayed() throws InterruptedException {
		String endpopupText = tcs.pom.getDealsPage().endMinimumpopup();
		Assert.assertEquals(endpopupText, "You're only ₹143.00 away from minimum delivery spend");
		Thread.sleep(4000);                                // for UI appear purpose
		tcs.pom.getDealsPage().continueShoppingClick();
		Thread.sleep(4000);                                // for UI appear purpose

	}
	
	


}
