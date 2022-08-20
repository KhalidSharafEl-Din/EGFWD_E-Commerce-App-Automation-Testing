package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_WishList {
    public WebElement PC_product(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/asus-n551jk-xo076h-laptop\"]"));
    }

    public WebElement detailed_wishButton(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-5"));
    }

    public WebElement wishlist_page(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement SKU_desired_product(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));

    }
}
