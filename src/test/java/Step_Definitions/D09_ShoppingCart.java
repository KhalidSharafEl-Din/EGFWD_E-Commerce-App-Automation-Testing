package Step_Definitions;

import Pages_POM_D_P.P09_ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D09_ShoppingCart {
    P09_ShoppingCart shoppingCart = new P09_ShoppingCart();

    // Scenario: products will added to shopping cart when user click on add to shopping cart from home page
    @When("user click on add to cart button")
    public void user_click_on_add_to_cart_button() throws InterruptedException {
        int count = shoppingCart.listCartButton().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int s = 0; s < count; s++) {
            if (s == 2) {
                shoppingCart.listCartButton().get(s).click();
                Assert.assertTrue(shoppingCart.green_massage().isDisplayed());
                Assert.assertTrue(shoppingCart.green_massage().getText().contains("The product has been added to your "));
            }
        }
        Thread.sleep(4000);
    }

    @And("Go to shopping cart page")
    public void Go_to_shopping_cart_page() {
        shoppingCart.shoppingCart_page().click();
    }

    @Then("phone product will added to shopping cart")
    public void phone_product_will_added_to_shoppingcart() {
        String SKU_NO = shoppingCart.SKU_number().getText();
        Assert.assertTrue(SKU_NO.contains("M8_HTC_5L"));
    }


    //Scenario: products will added to shopping cart when user click on add to shopping cart from detailed page
    @When("user clicks on add to cart button from HOME page")
    public void clicks_on_add_to_cart_button_from_HOMEpage() throws InterruptedException {
        int count = shoppingCart.listCartButton().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int s = 0; s < count; s++) {
            if (s == 1) {
                shoppingCart.listCartButton().get(s).click();
            }
        }
        Thread.sleep(4000);
    }

    @And("user go to product detailed page")
    public void go_to_product_detailed_page(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/apple-macbook-pro-13-inch"));

    }
    @And("clicks on add to cart button from detailed page")
    public void clicks_on_add_to_cart_button_from_detailed_page() throws InterruptedException {
     shoppingCart.cartButton_detailedPage().click();
     Thread.sleep(3000);
    }
    @Then("Apple product will added to shopping cart")
    public void Apple_product_will_added_to_shopping_cart(){
        Assert.assertTrue(shoppingCart.green_massage().isDisplayed());
        Assert.assertTrue(shoppingCart.green_massage().getText().contains("The product has been added to your "));
    }

}