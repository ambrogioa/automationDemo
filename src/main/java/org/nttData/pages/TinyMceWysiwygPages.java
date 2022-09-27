package org.nttData.pages;

import org.nttData.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TinyMceWysiwygPages extends BasePage {

    public TinyMceWysiwygPages(WebDriver driver) {
        super(driver);
    }

    private final By textAreaIframeBy = By.xpath("//div[@class='tox-edit-area']//iframe[@class='tox-edit-area__iframe']");
    private final By bodyTextAreaBy = By.xpath("//body[@id='tinymce']");

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    WebElement textAreaIframe;

    public boolean waitLoadTinyMcePage(){
        try{
            this.getWebDriverWait(5).until(ExpectedConditions.visibilityOf(this.textAreaIframe));
            System.out.println("LOGINFO---> TinyMCE WYSIWYG Editor page loaded!");
            return true;
        }catch(Exception e)
        {
            return false;
        }
    }

    public void switchToIframe(){
        WebElement iFrameCookies = this.driver.findElement(this.textAreaIframeBy);
        this.driver.switchTo().frame(iFrameCookies);
        WebElement bodyTextArea = this.driver.findElement(this.bodyTextAreaBy);
        bodyTextArea.click();
    }

    public void sendText(){
        //this.textAreaIframe.click();
        WebElement bodyTextArea = this.driver.findElement(this.bodyTextAreaBy);
        bodyTextArea.clear();
        bodyTextArea.sendKeys("PROVIAMO A VEDERE SE FUNZIONA");
        //WebElement statusbar = this.driver.findElement(By.xpath("//div[@class='tox-statusbar']"));
        //this.getWebDriverWait(10).until(ExpectedConditions.visibilityOf(statusbar));
    }

}
