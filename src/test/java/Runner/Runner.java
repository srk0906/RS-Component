package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;

import Page.ProductSearch;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Rajkannan\\WorkItems\\Eclipse-Workspace\\rsc\\src\\test\\java\\Features" // Location of feature files
		,glue= {"StepDefinitions"}, // Location of Step Definition files
		plugin= {"pretty","html:test-output","json:json-output/result.json","junit:junit-output/result.xml"}, // To Generate the different types of reporting formats
		monochrome = true, // Display the console output in proper readable format
		dryRun = false // To validate the mapping is proper between features and steps
		)
public class Runner {

	@BeforeClass
	public static void before() {
		ProductSearch.setDriver();
	}
}