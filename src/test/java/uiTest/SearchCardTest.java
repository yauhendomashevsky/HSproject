package uiTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.Waiter;
import io.cucumber.java.an.E;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import pages.EuBasePage;
import pages.RuBasePage;
import pages.CardLibraryPage;

import static com.codeborne.selenide.Selenide.$x;

public class SearchCardTest extends BaseTest{

    private String oneManaName = "Изера";
    private String expectedType = "Дракон";
    CardLibraryPage cardLibraryPage = new CardLibraryPage();
    RuBasePage ruBasePage = new RuBasePage();
    EuBasePage euBasePage = new EuBasePage();
    private static final String RUURL = "https://hearthstone.blizzard.com/ru-ru";
    private static final String EUURL = "https://hearthstone.blizzard.com/en-us";
    private SelenideElement searchingCard = $x("//img[@alt=\"Вызов\"]");

    @Test
    public void  searchTest(){
        Selenide.open(RUURL);
        ruBasePage.getCardMenuButton().click();
        ruBasePage.getCardLibraryMenu().click();
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

    @Test
    public void dhBeastCardCollectionTest(){
        Selenide.open(EUURL);
        euBasePage.cardButton.click();
        euBasePage.cardLibraryButton.click();
        cardLibraryPage.getFilterButton().click();
        cardLibraryPage.getClassFilterButton().click();
        cardLibraryPage.getDhFilterButton().click();
        cardLibraryPage.getMinionTypeButton().click();
        cardLibraryPage.getMinionTypeBeast().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getDhBeastCards().size(), 3);
    }

    @Test
    public void druidBeastCardCollectionTest(){
        Selenide.open(EUURL);
        euBasePage.cardButton.click();
        euBasePage.cardLibraryButton.click();
        cardLibraryPage.getFilterButton().click();
        cardLibraryPage.getClassFilterButton().click();
        cardLibraryPage.getDruidFilterButton().click();
        cardLibraryPage.getMinionTypeButton().click();
        cardLibraryPage.getMinionTypeBeast().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getDruidBeastCard().size(), 12);
    }
}
