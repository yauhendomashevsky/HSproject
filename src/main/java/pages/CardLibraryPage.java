package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CardLibraryPage extends BasePage{

    public SelenideElement classesMenu = $x("//div/div/h6[contains(text(),'Все классы')][1]");
    public SelenideElement demonhunterButton = $x("//h6[contains(text(),'Охотник на демонов')]");
    public SelenideElement druidButton = $x("//h6[contains(text(),'Друид')]");
    public SelenideElement inputSearch = $x("//input[@id=\"searchInput\"]");
    public SelenideElement manaSearchButton = $x("//button[@class=\"ManaControl__ManaCrystal-sc-12tfrw2-2 gXbfGO\"]/h4[contains(text(),'0')]");
    public SelenideElement izeraType = $x("//li[contains(text(), 'Тип существа')]/span[@class='value']");
    public SelenideElement cardImageButton = $x("//div[@class='PerspectiveWrapper__Wrapper-sc-1e2pchd-0 bHUoQS']");

    public CardLibraryPage() {
    }

    public SelenideElement getClassesMenu() {
        return classesMenu;
    }

    public SelenideElement getDemonhunterButton() {
        return demonhunterButton;
    }

    public SelenideElement getDruidButton() {
        return druidButton;
    }

    public SelenideElement getInputSearch() {
        return inputSearch;
    }

    public SelenideElement getManaSearchButton() {
        return manaSearchButton;
    }

    public SelenideElement getIzeraType() {
        return izeraType;
    }

    public SelenideElement getCardImageButton() {
        return cardImageButton;
    }
}
