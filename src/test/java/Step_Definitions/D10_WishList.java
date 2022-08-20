package Step_Definitions;

import Pages_POM_D_P.P10_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D10_WishList {
    P10_WishList wishListPage =new P10_WishList();
   @When("user click on pc product")
    public void click_on_apple_product(){
       Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
       wishListPage.PC_product().click();
    }
    @And("user clicks on add to wishlist button from detailed product page")
    public void clicks_on_add_to_wishlist_button() throws InterruptedException {
       wishListPage.detailed_wishButton().click();
       Thread.sleep(4000);
    }
    @And("user go to wish list page")
    public void go_to_wishlist_page(){
       wishListPage.wishlist_page().click();
    }

    @Then("pc product will added to wishlist")
    public void product_will_added_to_wishlist(){
      String SKU_Product = wishListPage.SKU_desired_product().getText();
        Assert.assertTrue(SKU_Product.contains("AS_551_LP"));
    }

}
