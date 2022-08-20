package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P12_CheckOut {
public WebElement jewelry_button(){
    return Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[ href=\"/jewelry\"]"));
}
public WebElement flower_bracelet(){
    return Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"] a img[alt=\"Picture of Flower Girl Bracelet\"] "));
}
public WebElement add_to_cart_flowerBracelet(){
    return Hooks.driver.findElement(By.cssSelector("button[id=\"add-to-cart-button-41\"]"));
}
public WebElement services_terms(){
    return Hooks.driver.findElement(By.cssSelector("input[id=\"termsofservice\"]"));
}
public WebElement checkout_button(){
    return Hooks.driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
}
public WebElement checkout_firstName(){
    return Hooks.driver.findElement(By.cssSelector(" input[id=\"BillingNewAddress_FirstName\"]"));
}
public WebElement checkout_lastName(){
    return Hooks.driver.findElement(By.cssSelector(" input[id=\"BillingNewAddress_LastName\"]"));
}
//public WebElement checkout_email(){
 //   return  Hooks.driver.findElement(By.cssSelector(" input[id=\"BillingNewAddress_Email\"]"));}
public WebElement country (){
    return Hooks.driver.findElement(By.cssSelector(" select[data-trigger=\"country-select\"]"));
}
public WebElement checkout_city(){
    return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_City\"]"));
}
public WebElement checkout_address(){
    return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_Address1\"]"));
}
public WebElement checkout_postalCode(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_ZipPostalCode\"]"));
    }
    public WebElement checkout_phone(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"BillingNewAddress_PhoneNumber\"]"));
    }
    public WebElement continue_button(){
        return Hooks.driver.findElement(By.cssSelector("div[id=\"billing-buttons-container\"] button[class=\"button-1 new-address-next-step-button\"]"));
    }
    public WebElement ground_shipping_method(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"shippingoption_0\"]"));
    }
    public WebElement continue_button_shipping_method(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 shipping-method-next-step-button\"]"));
    }
    public WebElement checkmoney_payment_method(){
        return Hooks.driver.findElement(By.cssSelector("input[id=\"paymentmethod_0\"]"));
    }
    public WebElement continue_payment_method(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
    }
    public WebElement continue_payment_information(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
    }
    public WebElement confirm_button(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
    }
    public WebElement order_number(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"order-number\"] strong"));
    }
}
