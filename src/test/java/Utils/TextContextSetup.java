package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TextContextSetup {
	public WebDriver driver;
	public PageObjectManager pom;
	public BaseTest bt;
	
	public TextContextSetup() throws IOException
	{
		bt = new BaseTest();
		pom = new PageObjectManager(bt.WebDrieverManager());
	}
	

}
