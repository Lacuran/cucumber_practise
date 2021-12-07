package testrunner;

import driver.BaseAbstractTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\kornel.wrzesien\\IdeaProjects\\cucumber_practise\\src\\main\\java\\features",
        glue = {"step_definitions"},
        plugin = {"pretty", "html:test-report"}
)

public class TestRunner extends BaseAbstractTest{

    @AfterClass
    public static void quit(){
        afterClassCleanup();
    }
}
