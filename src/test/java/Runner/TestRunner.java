package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\Feature",
		glue="StepDefination",
		dryRun = false,
		plugin = {"pretty"})

public class TestRunner extends AbstractTestNGCucumberTests
{

}
