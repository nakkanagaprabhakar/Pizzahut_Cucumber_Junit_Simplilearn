package StepDefinations;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRawcode {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".icon-close--white")).click();
		WebElement addressSearch = driver.findElement(By.cssSelector("[placeholder=\"Enter your location for delivery\"]"));
		addressSearch.sendKeys("lulu mall hyderabad");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("div.flex button"));
		for(int i=1;i<=options.size();i++)
		{
			String text = options.get(i).getText();
			if(text.contains("LuLu Mall Hyderabad"))
			{
				options.get(i).click();
				break;
			}
		}
		
		Thread.sleep(4000);
		Boolean bool = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[1]/div/div/div/div/span[2]")).isSelected();
		System.out.println(bool);
		Assert.assertFalse(bool);
		
		driver.findElement(By.linkText("Pizzas")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-synth='button--mexican-fiesta-recommended-pan-personal--one-tap']")).click();
		
		String amount = "350.70";
		String pizzaamount = driver.findElement(By.cssSelector(".text-right")).getText();
		if(pizzaamount.contains(amount))
		{
			System.out.println("amount is same and euqal = 350.70");
		}
		
		String checkoutbuttonText = driver.findElement(By.xpath("//a[@href=\"/order/checkout/\"]")).getText();
		String itemText = driver.findElement(By.cssSelector(".bg-green-dark")).getText();
		Assert.assertTrue(checkoutbuttonText.contains(itemText));
		System.out.println("checkout button contains no of items = 1 item added");
		Assert.assertTrue(checkoutbuttonText.contains(pizzaamount));
		System.out.println("checkout button contains total price count = 350.70");
		
		driver.findElement(By.linkText("Drinks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-synth=\"button--pepsi-600ml--one-tap\"]")).click();
		
		String TwoitemsText = "2 items";
		Assert.assertEquals(TwoitemsText, driver.findElement(By.cssSelector(".bg-green-dark")).getText());
		System.out.println("2 items are present in checkout button");
		
//		String pizzaPepsiAmount = driver.findElement(By.cssSelector(".text-right")).getText();
//		if( Integer.parseInt(pizzaPepsiAmount) > Integer.parseInt(pizzaamount))
//		{
//			System.out.println("pizza + pepsi amount bigger  = 410.56");
//		}
		
		
		driver.findElement(By.xpath("//button[@data-synth=\"basket-item-remove--mexican-fiesta-recommended-pan-personal\"]")).click(); 
		
		String oneitemText = "1 item";
		Assert.assertEquals(oneitemText, driver.findElement(By.cssSelector(".bg-green-dark")).getText());
		System.out.println("1 item present in checkout button");
		
		driver.findElement(By.xpath("//button[@data-synth=\"link--checkout\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-synth=\"link--continue-shopping\"]")).click();
		
		
		
		
	}

}
