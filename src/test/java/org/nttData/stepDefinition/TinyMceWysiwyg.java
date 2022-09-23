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
        Assert.assertTrue("LOGINFO---> TinyMCE WYSIWYG Editor page not loaded!", tinyMceWysiwygPages.waitLoadLoginPage());
        System.out.println("LOGINFO---> User is on TinyMCE WYSIWYG Editor page");
        throw new io.cucumber.java.PendingException();
    }

    @When("User switch to iFrame editor")
    public void userSwitchToIframeEditor() {
        System.out.println("LOGINFO---> User switch to iFrame editor");
        throw new io.cucumber.java.PendingException();
    }

    @Then("user insert text into editor")
    public void userInsertTextIntoEditor() {
        System.out.println("LOGINFO---> user insert text into editor");
        throw new io.cucumber.java.PendingException();
    }

}
