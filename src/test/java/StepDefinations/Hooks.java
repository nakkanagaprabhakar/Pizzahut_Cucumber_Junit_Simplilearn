package StepDefinations;

import java.io.IOException;

import Utils.TextContextSetup;
import io.cucumber.java.After;

public class Hooks {
	public TextContextSetup tcs;
	
	public Hooks(TextContextSetup tcs)
	{
		this.tcs = tcs;
	}
	
	@After
	public void AfterSceanrio() throws IOException
	{
		tcs.bt.WebDrieverManager().quit();       // All browsers will close with the help of "quite"
	}

	
	
	
}
