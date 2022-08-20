package Pages_POM_D_P;

import Step_Definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Registration {
    public WebElement registerButton(){return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));}
    public WebElement firstName(){return Hooks.driver.findElement(By.id("FirstName"));}
    public WebElement lastName(){return Hooks.driver.findElement(By.id("LastName"));}
    public WebElement userEmail(){return Hooks.driver.findElement(By.id("Email"));}
    public WebElement password(){return Hooks.driver.findElement(By.id("Password"));}
    public WebElement confirmPassword(){return Hooks.driver.findElement(By.id("ConfirmPassword"));}
    public WebElement clickRegister(){return Hooks.driver.findElement(By.id("register-button"));}
    public WebElement successRegister(){return Hooks.driver.findElement(By.cssSelector("a[class=\"button-1 register-continue-button\"]"));}
    public WebElement femaleGender(){return Hooks.driver.findElement(By.id("gender-female"));}
    public WebElement dayDropdown(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));}
    public WebElement monthDropdown(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));}
    public WebElement yearDropdown(){return Hooks.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));}
}
