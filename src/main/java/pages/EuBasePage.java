package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EuBasePage {
    public SelenideElement cardButton = $x("//span[contains(text(),'Cards')]/..");
    public SelenideElement cardLibraryButton = $x("//a[contains(text(),'Card Library')]");
    public SelenideElement modelIconButton = $x("//div[@class='Navbar-icon Navbar-mobileIcon Navbar-siteMenuIcon']");
}
