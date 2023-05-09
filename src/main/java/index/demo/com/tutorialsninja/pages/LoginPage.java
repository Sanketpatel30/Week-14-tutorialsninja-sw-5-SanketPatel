package index.demo.com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getWelcomeText(){
        CustomListeners.test.log(Status.PASS, "Get Welcome Text");
        Reporter.log("Get Welcome Text" + welcomeText.toString());
        String message = getTextFromElement(welcomeText);
        return message;
    }

    public void enterEmailId(String email){
        CustomListeners.test.log(Status.PASS, "Enter Email Id");
        Reporter.log("Enter Email Id" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        CustomListeners.test.log(Status.PASS, "Enter Password");
        Reporter.log("Enter Password" + passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void clickOnLoginButton(){
        CustomListeners.test.log(Status.PASS, "Click On Login Button");
        Reporter.log("Click On Login Button" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        CustomListeners.test.log(Status.PASS, "Get Error Message");
        Reporter.log("Get Error Message" + errorMessage.toString());
        String message = getTextFromElement(errorMessage);
        return message;
    }
}