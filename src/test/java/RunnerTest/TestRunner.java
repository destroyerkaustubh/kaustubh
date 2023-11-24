package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//Can we run the test cases in cucumber without testrunner class-Yes
@CucumberOptions(
		
		    features= {"AllFeature"},
		    glue= {"Steps"},
		    dryRun=false
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
