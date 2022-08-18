package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/visit.feature",
        glue = "step_definition"
)

public class RunTests extends AbstractTestNGCucumberTests {
}
