package Step_Definitions;

import Pages_POM_D_P.P06_ChangeCategories;
import Pages_POM_D_P.P07_ColorFilters;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D07_ColorFilters_StepDefs {

    P07_ColorFilters colorFiltersPage = new P07_ColorFilters();
    @When("user hover on Apparel option and select shoes category")
    public void hover_on_Apparel_option() throws InterruptedException {
        //finding element
        colorFiltersPage.apparel();
        //Instantiating Actions class
        Actions action = new Actions(Hooks.driver);
        //Hovering on apparel option
        action.moveToElement(colorFiltersPage.apparel());
        Thread.sleep(1000);

            // Locating the element from Sub Menu
            colorFiltersPage.sub_option_shoes();
            //To mouseover on sub menu
            action.moveToElement(colorFiltersPage.sub_option_shoes());
            action.click().build().perform();
        }

    @Then("user move successfully to the shoes page")
    public void user_move_successfully()
    {
        String url = "https://demo.nopcommerce.com/shoes";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    }

    @When("Selecting {string} color option")
    public void selectingColorOption(String color) {
        colorFiltersPage.redColorFilter().click();
    }

    @Then("Filter is applied")
    public void filterIsApplied() {
        String url = "https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);

    }
}
