package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RuBasePage {

    private static final String URL = "https://hearthstone.blizzard.com/ru-ru";
    public SelenideElement cardMenuButton = $x("//li/div/span[contains(text(), 'Карты')]");
    public SelenideElement gameMenuButton = $x("//li/div/span[contains(text(), 'Игра')]");
    public SelenideElement cardSetMenuButton = $x("//li/div/span[contains(text(), 'Наборы карт')]");
    public SelenideElement communityMenuButton = $x("//li/div/span[contains(text(), 'Сообщество')]");
    public SelenideElement newsMenuButton = $x("//li/div/span[contains(text(), 'Новости')]");
    public SelenideElement cybersportButton = $x("//a[@data-analytics-placement=\"Esports\"]");
    public SelenideElement cardLibraryMenu = $x("//a[@data-analytics-placement=\"Cards - Card Library\"]");

    public RuBasePage() {
    }

    public SelenideElement getCardMenuButton() {
        return cardMenuButton;
    }

    public SelenideElement getGameMenuButton() {
        return gameMenuButton;
    }

    public SelenideElement getCardSetMenuButton() {
        return cardSetMenuButton;
    }

    public SelenideElement getCommunityMenuButton() {
        return communityMenuButton;
    }

    public SelenideElement getNewsMenuButton() {
        return newsMenuButton;
    }

    public SelenideElement getCybersportButton() {
        return cybersportButton;
    }

    public SelenideElement getCardLibraryMenu() {
        return cardLibraryMenu;
    }
}
