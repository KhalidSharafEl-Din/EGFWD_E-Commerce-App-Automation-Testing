package Step_Definitions;

import Pages_POM_D_P.P06_ChangeCategories;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D06_ChangingCategories_StepDefs {

    P06_ChangeCategories hovering = new P06_ChangeCategories();
    @When("user hover on Apparel option and select clothes category")
    public void hover_on_Apparel_option() throws InterruptedException {
        //finding element
        hovering.apparel();
        //Instantiating Actions class
        Actions action = new Actions(Hooks.driver);
        //Hovering on apparel option
        action.moveToElement(hovering.apparel());
        Thread.sleep(2000);

            // Locating the element from Sub Menu
            hovering.sub_option_clothes();
            //To mouseover on sub menu
            action.moveToElement(hovering.sub_option_clothes());
            //build()- used to compile all the actions into a single step
            action.click().build().perform();
        }

    @Then("user move successfully to the clothes page")
    public void user_move_successfully()
    {
        String url = "https://demo.nopcommerce.com/clothing";
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
    }

}
