package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EuBasePage {
    public SelenideElement cardButton = $x("//li[@class='Menu-item Menu-item--3 Menu-item--cards has-dropdown']");
    public SelenideElement cardLibraryButton = $x("//a[contains(text(),'Card Library')]");
}
