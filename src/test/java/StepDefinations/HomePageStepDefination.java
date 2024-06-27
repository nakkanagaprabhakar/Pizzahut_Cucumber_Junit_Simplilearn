package StepDefinations;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination {
	public WebDriver driver;
	public WebElement blackpopup;
	public WebElement addressSearch;
	public TextContextSetup tcs;
	
	public HomePageStepDefination(TextContextSetup tcs)
	{
		this.tcs = tcs;
	}
	

	@Given("User launch Pizzahut application with {string}")
	public void user_launch_pizzahut_application_with(String link) throws InterruptedException, IOException {
		tcs.bt.WebDrieverManager().get(link);
		Thread.sleep(1000);                      // for UI appear purpose
		
	}
	
	@When("User wait for auto location black pop up screen")
	public void user_wait_for_auto_location_black_pop_up_screen() {
		tcs.pom.getHomePage().blackpopupScreen();
	    
	}
	
	@Then("User close the pop up screen")
	public void user_close_the_pop_up_screen() {
		tcs.pom.getHomePage().closeblackpopupScreen();

	}
	
	@Then("User see pop up for delivery asking for enter location")
	public void user_see_pop_up_for_delivery_asking_for_enter_location() {
		tcs.pom.getHomePage().locationenterbox();

	}
	
	@Then("User type address as {string}")
	public void user_type_address_as(String address) throws InterruptedException {
		tcs.pom.getHomePage().Typeaddress(address);
		Thread.sleep(2000);                            // for UI appear purpose

	}
	
	@Then("User select first auto populate drop down option")
	public void user_select_first_auto_populate_drop_down_option() throws InterruptedException {
		
		tcs.pom.getHomePage().SelectadressfromDropDown();
		Thread.sleep(4000);                               // for UI appear purpose

	}
	
	
	
	


}
