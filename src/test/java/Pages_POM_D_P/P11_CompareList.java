package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P11_CompareList {
    public WebElement Lenovo_product(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/lenovo-thinkpad-x1-carbon-laptop\"]"));
    }

    public WebElement HP_Laptop_product(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/hp-envy-6-1180ca-156-inch-sleekbook\"]"));
    }

    public WebElement detailed_compareButton(){
        return Hooks.driver.findElement(By.xpath ("//*[contains(text(),'Add to compare list')]"));
    }

    public WebElement productComparePage(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));
    }

    public WebElement SKU_desired_product(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"sku-number\"]"));

    }
}
