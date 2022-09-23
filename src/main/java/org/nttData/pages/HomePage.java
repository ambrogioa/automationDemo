package org.nttData.pages;

import org.nttData.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Form Authentication')]")
    WebElement linkFormAuthentication;

    @FindBy(xpath = "//*[contains(text(),'WYSIWYG Editor')]")
    WebElement linkWysiwygEditor;

    public void clickFormAuthenticationPage(){
        this.linkFormAuthentication.click();
    }

    public void clickWysiwygEditorPage(){
        this.linkWysiwygEditor.click();
    }


}
