package uiTest;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;
import pages.CardLibraryPage;

import static com.codeborne.selenide.Selenide.$x;

public class SearchCardTest extends BaseTest{

    static CardLibraryPage cardLibraryPage = new CardLibraryPage();
    private SelenideElement searchingCard = $x("//img[@alt=\"Вызов\"]");
    BaseTestMethod baseTestMethod = new BaseTestMethod();

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
