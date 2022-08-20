package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features ="src/main/resources/Features",
            glue = {"Step_Definitions"},
            tags = "@smoke",
            monochrome = true,
            plugin = {"pretty",
                    "html:target/cucumber.html",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt"},
            publish = true,
            dryRun = false
    )
    public class TestRunner extends AbstractTestNGCucumberTests {

    }
