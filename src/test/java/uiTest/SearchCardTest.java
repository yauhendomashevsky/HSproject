package uiTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.BasePage;
import pages.CardLibraryPage;

import static com.codeborne.selenide.Selenide.$x;

public class SearchCardTest extends BaseTest{

    private String oneManaName = "Изера";
    private String expectedType = "Дракон";
    CardLibraryPage cardLibraryPage = new CardLibraryPage();
    BasePage basePage = new BasePage();
    private static final String URL = "https://hearthstone.blizzard.com/ru-ru";
    private SelenideElement searchingCard = $x("//img[@alt=\"Вызов\"]");

    @Test
    public void  searchTest(){
        Selenide.open(URL);
        basePage.getCardMenuButton().click();
        basePage.getCardLibraryMenu().click();
        cardLibraryPage.getInputSearch().click();
        cardLibraryPage.getInputSearch().sendKeys(oneManaName, Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cardLibraryPage.getCardImageButton().click();
        Assert.assertEquals(cardLibraryPage.getIzeraType().getText(), expectedType);
    }
}
