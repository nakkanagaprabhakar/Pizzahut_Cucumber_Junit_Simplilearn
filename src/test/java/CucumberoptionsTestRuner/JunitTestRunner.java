package CucumberoptionsTestRuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)      // for junit 
@CucumberOptions(features="src/test/java/features" , glue="StepDefinations" , monochrome=true , tags = "@Smoke" , 
				plugin = { "pretty" , "html:target/Cucumber.html" , "json:target/Cucumber.json" , 
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"   }    )

public class JunitTestRunner {
	


}
