package index.demo.com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;


    public String getShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "Get Shopping Cart Text");
        Reporter.log("Get Shopping Cart Text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName() {
        CustomListeners.test.log(Status.PASS, "Get Product Name");
        Reporter.log("Get Product Name" + productName.toString());
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        CustomListeners.test.log(Status.PASS, "Get Delivery Date");
        Reporter.log("Get Delivery Date" + deliveryDate.toString());
        return getTextFromElement(deliveryDate);
    }

    public String getModel() {
        CustomListeners.test.log(Status.PASS, "Get Model");
        Reporter.log("Get Model" + model.toString());
        return getTextFromElement(model);
    }

    public String getTotal() {
        CustomListeners.test.log(Status.PASS, "Get Total");
        Reporter.log("Get Total" + total.toString());
        return getTextFromElement(total);
    }

    public void changeQuantity(String qty) {
        CustomListeners.test.log(Status.PASS, "Change Quantity");
        Reporter.log("Change Quantity" + qtyField.toString());
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton() {
        CustomListeners.test.log(Status.PASS, "Click On Qty Update Button");
        Reporter.log("Click On Qty Update Button" + qtyUpdateBtn.toString());
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage() {
        CustomListeners.test.log(Status.PASS, "Get Success Modified Message");
        Reporter.log("Get Success Modified Message" + successModifiedMessage.toString());
        return getTextFromElement(successModifiedMessage);
    }
}
