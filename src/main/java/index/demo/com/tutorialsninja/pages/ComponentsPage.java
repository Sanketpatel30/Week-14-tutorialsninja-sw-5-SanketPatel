package index.demo.com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComponentsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllComponents')]")
    WebElement showAllComponents;

    public void mouseHoverOnComponentsAndClick(){
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Components And Click");
        Reporter.log("Mouse Hover On Components And Click" + components.toString());
        clickOnElement(components);

    }
    public void clickOnShowAllComponents(){
        CustomListeners.test.log(Status.PASS, "Click On Show All Components");
        Reporter.log("Click On Show All Components" + showAllComponents.toString());
        clickOnElement(showAllComponents);

    }
}
