package org.nttData.pages;

import org.nttData.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//form[@id='login']")
    WebElement loginForm;

    @FindBy(xpath = "//form[@id='login']//button")
    WebElement loginButton;

    @FindBy(xpath = "//input[@id='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;

    /*@FindBy(xpath = "//div[@class='flash success']")
    WebElement loginSuccess;*/

    @FindBy(xpath = "//*[contains(text(),'You logged into a secure area!')]")
    WebElement loginSuccess;  //In alternativa a quello sopra

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /*public void waitLoadLoginPage() {
        this.getWebDriverWait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='login']")));
        System.out.println("LOGINFO---> Login Page loaded");
    }*/

    public boolean waitLoadLoginPage(){
        try{
            this.getWebDriverWait(5).until(ExpectedConditions.visibilityOf(this.loginForm));
            System.out.println("LOGINFO---> Login Page loaded!");
            return true;
        }catch(Exception e)
        {
           return false;
        }
    }

    public void insertData(){
        this.inputUsername.sendKeys("tomsmith");
        this.inputPassword.sendKeys("SuperSecretPassword!");
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }

    public boolean loginSuccessfull(){
        try{
            return this.loginSuccess.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
