package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingHomePage;
import pages.SignUpLoginPage;
import utilities.Driver;

public class ShoppingStepDefs {
    ShoppingHomePage shoppingHomePage= new ShoppingHomePage();
    SignUpLoginPage signUpLoginPage=new SignUpLoginPage();
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Driver.getDriver().getTitle();

    }
    @When("Click Signup-Login button")
    public void click_signup_login_button() {
        shoppingHomePage.signUpLoginLink.click();

    }
    @When("Enter {string} and {string} and click on SignUp Button")
    public void enter_and_and_click_on_sign_up_button(String string, String string2) {
signUpLoginPage.nameBox.sendKeys(string);
signUpLoginPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
signUpLoginPage.signUpButton.click();

    }
    @When("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {

    }
    @Then("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() {

    }
    @Then("Verify  Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

    }
    @When("Add products to cart")
    public void add_products_to_cart() {

    }
    @When("Click Cart button")
    public void click_cart_button() {

    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {

    }
    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {

    }
    @Then("Verify that the delivery address and billing address are same")
    public void verify_that_the_delivery_address_and_billing_address_are_same() {

    }
    @When("Click logout button")
    public void click_logout_button() {

    }
    @Then("Verify that user logged out")
    public void verify_that_user_logged_out() {

    }
    @Then("Close the application")
    public void close_the_application() {

    }



    }


