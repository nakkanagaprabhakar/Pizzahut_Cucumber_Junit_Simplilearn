package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public WebDriver driver;
	
	public WebDriver WebDrieverManager() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		if(driver == null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
				driver = new ChromeDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("Firefox"))
			{
				driver = new FirefoxDriver();
			}
			if(prop.getProperty("browser").equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
		}
		
		return driver;
	}



}
