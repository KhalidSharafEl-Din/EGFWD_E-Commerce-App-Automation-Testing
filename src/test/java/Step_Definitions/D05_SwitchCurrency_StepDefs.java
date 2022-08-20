package Step_Definitions;

import Pages_POM_D_P.P05_SwitchCurrency;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D05_SwitchCurrency_StepDefs {

   P05_SwitchCurrency default_currency = new P05_SwitchCurrency();
    //Scenario_1: user make sure about the default currency

   @Given("user will make sure that default currency is US_dollar")
   public void dollar_sign_in_all_products(){
      Assert.assertTrue(default_currency.dollar().isSelected(), "dollar 1");
      Assert.assertFalse(default_currency.euro().isSelected(), "euro 3");
      Assert.assertTrue(default_currency.dollar_sign().getText().contains("$"));
   }


   //Scenario_2: user could select any option from currency dropdown (select different currency instead of dollar)
   Select select = new Select(default_currency.selectOption());
    @Given("user go to dropdown currency")
    public void dropdown_currency(){
        default_currency.dollar().click();
    }

   @When("user select any option from dropdown")
   public void select_any_option() {
      int i = select.getOptions().size();
      System.out.print("number of options =" + i);
      Assert.assertEquals(2, select.getOptions().size());
      select.selectByVisibleText("Euro");
   }
   @Then("user will see option sign in all products and it is switched successfully")
    public void switch_success() {
      //Assert.assertEquals("Euro", select.getFirstSelectedOption().getText());

      String euro = default_currency.euro_sign().getText();
      System.out.println(euro);
      Assert.assertTrue(euro.contains("€"));

      }


}
