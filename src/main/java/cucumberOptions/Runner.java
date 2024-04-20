package cucumberOptions;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
    features = "src/main/resources",
    glue = "stepdefs",
    tags = "@TC01 or @TC02 or @TC03 or @TC04 or @TC05 or @TC06 or @TC07",
    monochrome = true,
    plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class Runner {
    private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass
    public void setup() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Test(dataProvider = "scenarios")
    public void scenario(PickleWrapper pickle, FeatureWrapper featureWrapper) {
        testNGCucumberRunner.runScenario(pickle.getPickle());
    }
    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }
    @AfterClass
    public void tearDown() {
        testNGCucumberRunner.finish();
    }
}
