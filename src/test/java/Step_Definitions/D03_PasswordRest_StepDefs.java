package Step_Definitions;

import Pages_POM_D_P.P02_Login;
import Pages_POM_D_P.P03_PasswordReset;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D03_PasswordRest_StepDefs {

    P03_PasswordReset passwordResetPage = new P03_PasswordReset();


    @And("user click on Forgot password?")
    public void userClickOnForgotPassword() {
        passwordResetPage.forgotPassword().click();
    }

    @When("user enter his email {string}")
    public void userEnterHisEmail(String email) {
        passwordResetPage.userEmail().sendKeys(email);
    }

    @And("clicks on Recover button")
    public void clicksOnRecoverButton() {
        passwordResetPage.recoverButton().click();
    }

    @Then("System confirms email have been sent")
    public void systemConfirmsEmailHaveBeenSent() {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = passwordResetPage.confirmationMessage().getText();
        Assert.assertEquals(actualResult,expectedResult);
    }
}
