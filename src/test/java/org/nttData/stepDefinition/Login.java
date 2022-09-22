package org.nttData.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nttData.listeners.Hook;
import org.nttData.pages.LoginPage;
import org.junit.Assert;


public class Login {

    LoginPage loginPage = new LoginPage(Hook.browserDriver);

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue("LOGINFO---> Login Page not loaded!", loginPage.waitLoadLoginPage());
    }
    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        try{
            System.out.println("LOGINFO---> User enters username and password");
            loginPage.insertData();
        }catch(Exception e)
        {throw new RuntimeException(e);}
    }
    @When("Click on login button")
    public void clickOnLoginButton() {
        try{
            System.out.println("LOGINFO---> Click on login button");
            loginPage.clickLoginButton();
        }catch(Exception e)
        {throw new RuntimeException(e);}
    }
    @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        try{
            System.out.println("LOGINFO---> user is navigated to the home page");
            if(loginPage.loginSuccessfull()){
                System.out.println("LOGINFO---> user is logged successfull");
            }
            else {
                System.out.println("LOGINFO---> user is not logged!");
                Assert.fail("LOGINFO---> user is not logged!");
            }
        }catch(Exception e)
        {throw new RuntimeException(e);}
    }

}
