package org.nttData.pages;

import org.nttData.common.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TinyMceWysiwygPages extends BasePage {

    public TinyMceWysiwygPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    WebElement textAreaIframe;

    public boolean waitLoadLoginPage(){
        try{
            this.getWebDriverWait(5).until(ExpectedConditions.visibilityOf(this.textAreaIframe));
            System.out.println("LOGINFO---> TinyMCE WYSIWYG Editor page loaded!");
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }

}
