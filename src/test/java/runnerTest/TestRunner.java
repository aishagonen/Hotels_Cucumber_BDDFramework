package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-html-reports/cucumber.json"},
        snippets = cucumber.api.SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false,
        features = {"src/test/resources/features"},
        //tags = {"@hotels1"},
        //tags = {"@hotels2"},
        tags = {"@hotels"},
        glue = {"stepDefinition"}
)


public class TestRunner {


}
