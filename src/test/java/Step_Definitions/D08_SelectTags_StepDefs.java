package Step_Definitions;

import Pages_POM_D_P.P08_SelectTags;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Step_Definitions.Hooks.driver;

public class D08_SelectTags_StepDefs {
    P08_SelectTags selectTagsPage = new P08_SelectTags();
    static String tag_Store ;
    @When("user click on {string} Tag")
    public void userClickOnTag(String tag) {
        tag_Store = tag;
        driver.findElement(new By.ByCssSelector("a[href=\"/"+ tag +"\"]")).click();
    }

    @Then("user redirected to correct page")
    public void userRedirectedToCorrectPage() {
        String url = "https://demo.nopcommerce.com/"+tag_Store;
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    }
}
