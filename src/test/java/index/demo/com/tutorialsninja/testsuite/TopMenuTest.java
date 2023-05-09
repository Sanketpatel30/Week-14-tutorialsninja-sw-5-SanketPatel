package index.demo.com.tutorialsninja.testsuite;

import index.demo.com.tutorialsninja.customlisteners.CustomListeners;
import index.demo.com.tutorialsninja.pages.ComponentsPage;
import index.demo.com.tutorialsninja.pages.DesktopsPage;
import index.demo.com.tutorialsninja.pages.HomePage;
import index.demo.com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import index.demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    HomePage homePage;
    DesktopsPage deskTops;
    LaptopsAndNoteBooksPage laptopsAndNoteBooks;
    ComponentsPage componentsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        deskTops = new DesktopsPage();
        laptopsAndNoteBooks = new LaptopsAndNoteBooksPage();
        componentsPage = new ComponentsPage();
    }

    @Test (groups = {"Sanity", "Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        deskTops.mouseHoverOnDesktopsAndClick();
        homePage.selectMenuBar("Show AllDesktops");
        // homePage.clickOnShowAllDeskTops();
        laptopsAndNoteBooks.mouseHoverOnLaptopsAndNoteBooksAndClick();
        laptopsAndNoteBooks.clickOnShowAllLaptopsAndNotebooks();
        componentsPage.mouseHoverOnComponentsAndClick();
        componentsPage.clickOnShowAllComponents();

    }
}