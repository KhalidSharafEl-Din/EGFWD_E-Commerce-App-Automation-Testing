package Step_Definitions;

import Pages_POM_D_P.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D02_Login_StepDefs {
    // apply POM Design Pattern
    P02_Login loginPage = new P02_Login();

// you could also use constructor
// public D01_loginStepDef() {}

    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {
        loginPage.loginButton().click();
    }
    // Data Driven testing + syntax el variable mn el feature
    @When("^user login with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void valid_username_password(String type, String username, String password) {
        loginPage.emailTxt().sendKeys(username);
        loginPage.passwordTxt().sendKeys(password);
    }

    @And("user press on login button")
    public void login_button()
    {
        loginPage.passwordTxt().sendKeys(Keys.ENTER);
    }

    @Then("user login to the system successfully")
    public void success_login()
    {
        WebElement myAccount =Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
        Assert.assertTrue(myAccount.isDisplayed());
    }
}
