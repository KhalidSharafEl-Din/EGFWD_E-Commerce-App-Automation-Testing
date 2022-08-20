package Step_Definitions;

import Pages_POM_D_P.P04_Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D04_Search_StepDefs {
    P04_Search searchPage = new P04_Search();

    @When("user clicks on search field")
    public void user_clicks_on_search_field()
    {
        // locate search field and click on it
        searchPage.searchField().click();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product()
    {
        searchPage.searchField().sendKeys("book");
        searchPage.searchbtn().click();
    }

    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = searchPage.searchResults().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count ; x++) {
            System.out.println(searchPage.searchResults().get(x).getText());
            Assert.assertTrue(searchPage.searchResults().get(x).getText().toLowerCase().contains("book"));
        }
    }

    //Scenario: user could search for product using SKU

    @And("user search with sku of product")
    public void search_with_sku_of_product() throws InterruptedException {
        searchPage.searchField().sendKeys("CS_TSHIRT");
        searchPage.searchbtn().click();
    }

    @Then("user could find the desired product")
    public void find_desired_product(){
    Assert.assertTrue(searchPage.product_skuName().getText().toLowerCase().contains("shirt"));
    searchPage.product_skuName().click();
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/custom-t-shirt");
    Assert.assertTrue(searchPage.product_sku().getText().toLowerCase().contains("tshirt"));
    }
}
