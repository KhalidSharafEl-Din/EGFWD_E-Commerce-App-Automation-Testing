package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P09_ShoppingCart {
    public List<WebElement> listCartButton()
    {
        return Hooks.driver.findElements(By.cssSelector(" button[class=\"button-2 product-box-add-to-cart-button\"]"));
    }
    public WebElement green_massage(){
        return Hooks.driver.findElement(By.cssSelector(" p[class=\"content\"]"));
    }
    public WebElement shoppingCart_page(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
    }
    public WebElement SKU_number(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));
    }
    public WebElement cartButton_detailedPage(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));
    }
}
