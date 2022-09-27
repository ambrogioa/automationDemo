package org.nttData.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.nttData.listeners.Hook;
import org.nttData.pages.HomePage;
import org.nttData.pages.TinyMceWysiwygPages;

public class TinyMceWysiwyg {

    TinyMceWysiwygPages tinyMceWysiwygPages = new TinyMceWysiwygPages(Hook.browserDriver);

    @Given("User is on TinyMCE WYSIWYG Editor page")
    public void userIsOnTinyMceWysiwygEditorPage() {
        HomePage homePage = new HomePage(Hook.browserDriver);
        homePage.clickWysiwygEditorPage();
        Assert.assertTrue("LOGINFO---> TinyMCE WYSIWYG Editor page not loaded!", tinyMceWysiwygPages.waitLoadTinyMcePage());
        System.out.println("LOGINFO---> User is on TinyMCE WYSIWYG Editor page");
    }

    @When("User switch to iFrame editor")
    public void userSwitchToIframeEditor() {
        try{
            tinyMceWysiwygPages.switchToIframe();
            System.out.println("LOGINFO---> User switch to iFrame editor");
        }catch(Exception e)
        {throw new RuntimeException(e);}
    }

    @Then("user insert text into editor")
    public void userInsertTextIntoEditor() {
        try{
            tinyMceWysiwygPages.sendText();
            System.out.println("LOGINFO---> user insert text into editor");
        }catch(Exception e)
        {throw new RuntimeException(e);}
    }

}
