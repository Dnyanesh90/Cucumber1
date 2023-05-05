package TestRunnerPackage;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFile\\Demo99guru.feature"},
		glue= {"StepDefination\\DemoGuru99"},
		dryRun=true,
		monochrome=true,
		plugin= {"json:AllReports/abc.json",
				  "junit:AllReports/abc.xml",
				  "html:AllReports/xyz.html",
				  "pretty:AllReports/abc.txt",
				  "pretty:AllReports/abc.pdf",
				 }
		)
public class TestRunnerClassA {

}
