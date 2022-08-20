package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_SwitchCurrency {
     public WebElement dollar(){
    return Hooks.driver.findElement
            (By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F\"]"));
}
     public WebElement euro(){
         return  Hooks.driver.findElement
                 (By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
     }
    public WebElement selectOption(){
         return Hooks.driver.findElement(By.name("customerCurrency"));
    }

    public WebElement euro_sign(){
         return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement dollar_sign(){
         return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
