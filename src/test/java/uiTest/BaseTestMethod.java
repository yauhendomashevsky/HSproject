package uiTest;

import com.codeborne.selenide.Selenide;
import pages.CardLibraryPage;
import pages.EuBasePage;

public class BaseTestMethod extends EuBasePage {

    CardLibraryPage cardLibraryPage = new CardLibraryPage();
    private static final String EUURL = "https://hearthstone.blizzard.com/en-us";

    public void beastTestRunner(){
        Selenide.open(EUURL);
        if (modelIconButton.isDisplayed()){
            modelIconButton.click();
        }
        cardButton.click();
        cardLibraryButton.click();
        cardLibraryPage.getFilterButton().click();
        cardLibraryPage.getMinionTypeButton().click();
        cardLibraryPage.getMinionTypeBeast().click();
        cardLibraryPage.getClassFilterButton().click();
    }

    public BaseTestMethod() {
    }
}
