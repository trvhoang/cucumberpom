package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
                features = "src/test/resources",
                glue = "src/main/stepDefs")

public class RunnerTest {
}