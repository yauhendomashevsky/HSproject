package uiTest;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
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
    static CardLibraryPage cardLibraryPage = new CardLibraryPage();
    RuBasePage ruBasePage = new RuBasePage();
    EuBasePage euBasePage = new EuBasePage();
    private static final String RUURL = "https://hearthstone.blizzard.com/ru-ru";
    private static final String EUURL = "https://hearthstone.blizzard.com/en-us";
    private SelenideElement searchingCard = $x("//img[@alt=\"Вызов\"]");
    BaseTestMethod baseTestMethod = new BaseTestMethod();

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
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getDhFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getDhBeastCards().size(), 3);
    }

    @Test
    public void hunterBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getHunterFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 14);
    }

    @Test
    public void mageBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getMageFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 1);
    }

    @Test
    public void paladinBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getPaladinFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 2);
    }

    @Test
    public void priestBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getPriestFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 2);
    }

    @Test
    public void rogueBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getRogueFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 3);
    }

    @Test
    public void shamanBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getShamanFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 3);
    }

    @Test
    public void druidBeastCardCollectionTest(){
        baseTestMethod.beastTestRunner();
        cardLibraryPage.getDruidFilterButton().click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(cardLibraryPage.getNumberOfBeastCard().size(), 12);
    }
}
