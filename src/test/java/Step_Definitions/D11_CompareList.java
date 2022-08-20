package Step_Definitions;

import Pages_POM_D_P.P11_CompareList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D11_CompareList {
    P11_CompareList compareListPage =new P11_CompareList();

    @And("user click on lenovo laptop")
    public void userClickOnLenovoProduct() throws InterruptedException {
        compareListPage.Lenovo_product().click();
        Thread.sleep(4000);
    }

    @And("user click on HTC product")
    public void userClickOnHTCProduct() throws InterruptedException {
        compareListPage.HP_Laptop_product().click();
        Thread.sleep(4000);
    }

    @And("user clicks on add to compare button from detailed product page")
    public void userClicksOnAddToCompareButtonFromDetailedProductPage() throws InterruptedException {
        compareListPage.detailed_compareButton().click();
        Thread.sleep(4000);
    }

    @And("user go to compare list page")
    public void userGoToCompareListPage() {
        compareListPage.productComparePage().click();
    }

    @Then("products will be added to compareList")
    public void productsWillBeAddedToCompareList() {
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/lenovo-thinkpad-x1-carbon-laptop\"]")).isDisplayed());
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/hp-envy-6-1180ca-156-inch-sleekbook\"]")).isDisplayed());
    }

    @And("Go to Laptop page")
    public void goToLaptopPage() {
       Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");
    }
}
