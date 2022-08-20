package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_Search {
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchbtn()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> searchResults()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public WebElement product_skuName(){
        return Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a"));
    }

    public WebElement product_sku(){
        return Hooks.driver.findElement(By.id("sku-29"));
    }
}
