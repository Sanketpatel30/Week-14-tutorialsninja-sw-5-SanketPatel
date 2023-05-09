package index.demo.com.tutorialsninja.pages;

import com.aventstack.extentreports.Status;
import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import java.util.ArrayList;
import java.util.List;

@Listeners
public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement lookUpDesktops;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllDesktops')]")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortByPosition;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    WebElement productsList;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortBy;


    public void mouseHoverOnDesktopsAndClick() {
        CustomListeners.test.log(Status.PASS, "Mouse Hover On Desktops And Click");
        Reporter.log("Mouse Hover On Desktops And Click" + lookUpDesktops.toString());
        clickOnElement(lookUpDesktops);

    }

    public void clickOnShowAllDeskTops() {
        CustomListeners.test.log(Status.PASS, "Click On Show All Desktops");
        Reporter.log("Click On Show All Desktops" + showAllDesktops.toString());
        clickOnElement(showAllDesktops);
    }

    public void sortingDesktopsFromZtoA(String name) {
        CustomListeners.test.log(Status.PASS, "Sorting Desktops From ZtoA");
        Reporter.log("Sorting Desktops From ZtoA" + sortByPosition.toString());
        selectByVisibleTextFromDropDown(sortByPosition, name);

    }

    public ArrayList<String> getProductsNameList() {
        List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        return originalProductsName;
    }

    public void selectSortByOption(String option) {
        CustomListeners.test.log(Status.PASS, "Select Sort By Option");
        Reporter.log("Select Sort By Option" + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, option);
    }

    public void selectProductByName(String product) {
        List<WebElement> products = getListOfElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
    }
}
