package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement loginButton(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));}
    public WebElement emailTxt(){return   Hooks.driver.findElement(By.id("Email"));}
    public WebElement passwordTxt(){return   Hooks.driver.findElement(By.id("Password"));}
}
