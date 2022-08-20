package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P07_ColorFilters {
    public WebElement apparel(){
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/apparel\"]"));
    }

    public WebElement sub_option_shoes(){
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/shoes\"]"));
    }

    public WebElement redColorFilter(){
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }

    public List<WebElement> productList ()
    {
        List<WebElement> productTitles = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
        return productTitles;
    }
    public String displayFlag ()
    {
        String displayFlag= Hooks.driver.findElement(By.xpath("//div[@class=\"ajax-products-busy\"]")).getAttribute("style");
        return displayFlag;
    }

    public List<WebElement> availableColors()
    {
        List <WebElement> availableColors = Hooks.driver.findElements(By.xpath("//span[@class=\"attribute-square-container\"]"));
        return availableColors;
    }
}
