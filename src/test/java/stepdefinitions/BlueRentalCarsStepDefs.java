package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class BlueRentalCarsStepDefs {
BlueRentalPage blueRentalPage;
    @Given("user is on the bluerentalcars.com")
    public void user_is_on_the_bluerentalcars_com() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalPage= new BlueRentalPage();

    }
    @When("user login with customer credential")
    public void user_login_with_customer_credential() throws InterruptedException {
       Actions actions = new Actions(Driver.getDriver());
       actions.click(blueRentalPage.loginButton).build().perform();

      //  blueRentalPage.loginButton.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("customer_username"));
        ReusableMethods.waitForVisibility(blueRentalPage.email,5);
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        ReusableMethods.waitForVisibility(blueRentalPage.email,5);
        blueRentalPage.loginButton2.click();
        ReusableMethods.waitForVisibility(blueRentalPage.email,5);
    }

    @Then("verify the customer login successfully")
    public void verify_the_customer_login_successfully() throws InterruptedException {
        Thread.sleep(5000);

        Assert.assertTrue(blueRentalPage.userId.isDisplayed());


    }



}
