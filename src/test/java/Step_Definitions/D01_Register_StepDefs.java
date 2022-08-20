package Step_Definitions;

import Pages_POM_D_P.P01_Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_Register_StepDefs{

    P01_Registration registrationPage =new P01_Registration();

    @Given("Go to Registration Page")
    public void register_page(){
        registrationPage.registerButton().click();
    }

    @When("^Enter valid \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Enter_first_last_email_password(String firstname, String lastname, String Email,
                                                String password,String confirmPassword){
        registrationPage.firstName().sendKeys(firstname);
        registrationPage.lastName().sendKeys(lastname);
        registrationPage.userEmail().sendKeys(Email);
        registrationPage.password().sendKeys(password);
        registrationPage.confirmPassword().sendKeys(confirmPassword);
    }
    @And("User click on register button")
    public void press_register()
    {
        registrationPage.clickRegister().click();
    }

    @Then("User Directed to profile page")
    public void success_register() {Assert.assertTrue(registrationPage.successRegister().getText().toLowerCase().contains("continue"));}

    //Scenario: user could register with valid necessary and optional data
    @When("user select female gender")
    public void select_female_gender(){
     registrationPage.femaleGender().click();
    }
    @And("Enter birth of day")
        public void Day_dropdown () throws InterruptedException {
         int min = 1;
         int max = 31;
         int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
        Select select = new Select(registrationPage.dayDropdown());
        select.selectByIndex(random_int);
            Thread.sleep(2000);

     }
        @And("Enter birth of Month")
                public void Month_dropdown() throws InterruptedException {
            int min = 1;
            int max = 12;
            int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
            Select select = new Select(registrationPage.monthDropdown());
            select.selectByIndex(random_int);
            Thread.sleep(2000);
        }
        @And("Enter birth of year")
        public void year_dropdown() throws InterruptedException {
            int min = 1;
            int max = 110;
            int random_int = (int)Math.floor(Math.random()*(max - min+1)+min);
            Select select = new Select(registrationPage.yearDropdown());
            select.selectByIndex(random_int);
            Thread.sleep(2000);
        }


}
