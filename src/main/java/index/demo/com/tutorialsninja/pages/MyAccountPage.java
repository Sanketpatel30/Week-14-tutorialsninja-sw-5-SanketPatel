package index.demo.com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class MyAccountPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;

   @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedText;

  @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;

    public String getAccountLogoutText() {
        CustomListeners.test.log(Status.PASS, "Get Account Logout Text");
        Reporter.log("Get Account Logout Text" + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }

    public String getYourAccountHasBeenCreatedText() {
        CustomListeners.test.log(Status.PASS, "Get Your Account Has Been Created Text");
        Reporter.log("Get Your Account Has Been Created Text" + accountCreatedText.toString());
        return getTextFromElement(accountCreatedText);
    }

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS, "Click On Continue Button");
        Reporter.log("Click On Continue Button" + continueBtn.toString());
        clickOnElement(continueBtn);
    }
}
