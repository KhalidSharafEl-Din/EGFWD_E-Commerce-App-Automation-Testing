package Step_Definitions;

import Pages_POM_D_P.P12_CheckOut;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D12_CheckOut_StepDefs{
    P12_CheckOut checkOut = new P12_CheckOut();
    @When("logged user press on jewelry category")
    public void jewelry_category() throws InterruptedException {
        checkOut.jewelry_button().click();
        Thread.sleep(4000);
    }
    @And("press add to cart to flower bracelet")
    public void flower_bracelet() throws InterruptedException {
      checkOut.flower_bracelet().click();
      Thread.sleep(4000);
      checkOut.add_to_cart_flowerBracelet().click();
    }
   @And("Press on services terms and checkout button")
    public void services_terms_and_checkout_button() throws InterruptedException {
        checkOut.services_terms().click();
        Thread.sleep(4000);
        checkOut.checkout_button().click();
    }
    @And("user fill the data of billing address press on continue button")
    public void data_of_billing_address_press_on_continue_button(){
     checkOut.checkout_firstName().click();
     checkOut.checkout_firstName().sendKeys("Khalid");

     checkOut.checkout_lastName().click();
     checkOut.checkout_lastName().sendKeys("SharafEl-din");

     //checkOut.checkout_email().click();
     //checkOut.checkout_email().sendKeys("Test1@example.com");

        Select select =new Select(checkOut.country());
        select.selectByValue("123");

     checkOut.checkout_city().click();
     checkOut.checkout_city().sendKeys("UAS");

     checkOut.checkout_address().click();
     checkOut.checkout_address().sendKeys("NewYork");

     checkOut.checkout_postalCode().click();
     checkOut.checkout_postalCode().sendKeys("105");

     checkOut.checkout_phone().click();
     checkOut.checkout_phone().sendKeys("01005509418");

     checkOut.continue_button().click();
    }

    @And("user select Ground of shipping method and press continue")
    public void select_Ground_of_shipping_method(){
     checkOut.ground_shipping_method().click();
     checkOut.continue_button_shipping_method().click();
    }
    @And("user select Check_money for payment method and press continue")
    public void select_Checkmoney_for_payment_method(){
        checkOut.checkmoney_payment_method().click();
        checkOut.continue_payment_method().click();
    }
    @And("user press continue for payment information")
    public void press_continue_for_payment_information() throws InterruptedException {
        checkOut.continue_payment_information().click();
        Thread.sleep(1000);
    }
    @And("user press confirm for confirm order")
    public void confirm_for_confirm_order() throws InterruptedException {
        checkOut.confirm_button().click();
        Thread.sleep(1000);
    }
    @Then("order has been successfully processed")
    public void order_has_been_successfully_processed(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("completed"));
        Assert.assertTrue(checkOut.order_number().getText().toLowerCase().contains("order number"));

    }

}
