package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CardLibraryPage extends RuBasePage {

    public SelenideElement classesMenu = $x("//div/div/h6[contains(text(),'Все классы')][1]");
    public SelenideElement demonhunterButton = $x("//h6[contains(text(),'Охотник на демонов')]");
    public SelenideElement druidButton = $x("//h6[contains(text(),'Друид')]");
    public SelenideElement inputSearch = $x("//input[@id=\"searchInput\"]");
    public SelenideElement manaSearchButton = $x("//button[@class=\"ManaControl__ManaCrystal-sc-12tfrw2-2 gXbfGO\"]/h4[contains(text(),'0')]");
    public SelenideElement izeraType = $x("//li[contains(text(), 'Тип существа')]/span[@class='value']");
    public SelenideElement cardImageButton = $x("//div[@class='PerspectiveWrapper__Wrapper-sc-1e2pchd-0 bHUoQS']");
    public SelenideElement minionTypeButton = $x("//div[@aria-labelledby=\"downshift-9-label\"]/div/div");
    public SelenideElement minionTypeBeast = $x("//div[@class=\"Item-sc-2wwe67-0 Item__TextItem-sc-2wwe67-1 bvfIUJ\"]/h6[contains(text(),'Beast')]/..");
    public SelenideElement minionTypeDemon = $x("//div[@id=\"downshift-49-item-3\"]");
    public SelenideElement minionTypeDragon = $x("//div[@id=\"downshift-49-item-4\"]");
    public SelenideElement minionTypeElemental = $x("//div[@id=\"downshift-49-item-5\"]");
    public SelenideElement minionTypeMech = $x("//div[@id=\"downshift-49-item-6\"]");
    public SelenideElement minionTypeMurloc = $x("//div[@id=\"downshift-49-item-7\"]");
    public SelenideElement minionTypeNaga = $x("//div[@id=\"downshift-49-item-8\"]");
    public SelenideElement minionTypePirate = $x("//div[@id=\"downshift-49-item-9\"]");
    public SelenideElement minionTypeQuilboar = $x("//div[@id=\"downshift-49-item-10\"]");
    public SelenideElement minionTypeTotem = $x("//div[@id=\"downshift-49-item-11\"]");
    public ElementsCollection dhBeastCards = $$x("//a[@class='CardLayout__CardWrap-c9pp6v-0 iaYFEU']");
    public SelenideElement dhFilterButton = $x("//h6[contains(text(),'Demon Hunter')]");
    public SelenideElement classFilterButton = $x("//h6[contains(text(),'All Classes')]");
    public SelenideElement druidFilterButton = $x("//h6[contains(text(),'Druid')]");
    public SelenideElement hunterFilterButton = $x("//div[@class='CircleIcon-fmr8yz-0 ClassIcon-sc-1hgwqgj-0 ClassControl__ItemIcon-jisfzz-1 DtAzA hunter']/../h6");
    public SelenideElement mageFilterButton = $x("//h6[contains(text(),'Mage')]");
    public SelenideElement paladinFilterButton = $x("//h6[contains(text(),'Paladin')]");
    public SelenideElement priestFilterButton = $x("//h6[contains(text(),'Priest')]");
    public SelenideElement rogueFilterButton = $x("//h6[contains(text(),'Rogue')]");
    public SelenideElement shamanFilterButton = $x("//h6[contains(text(),'Shaman')]");
    public ElementsCollection numberOfBeastCard = $$x("//a[@class='CardLayout__CardWrap-c9pp6v-0 iaYFEU']");
    public SelenideElement filterButton = $x("//div[@class=\"AdvancedFiltersButton__FilterSpace-sc-1cpqkjh-1 behVaH\"]");


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

    public SelenideElement getMinionTypeButton() {
        return minionTypeButton;
    }

    public SelenideElement getMinionTypeBeast() {
        return minionTypeBeast;
    }

    public SelenideElement getMinionTypeDemon() {
        return minionTypeDemon;
    }

    public SelenideElement getMinionTypeDragon() {
        return minionTypeDragon;
    }

    public SelenideElement getMinionTypeElemental() {
        return minionTypeElemental;
    }

    public SelenideElement getHunterFilterButton() {
        return hunterFilterButton;
    }

    public SelenideElement getMageFilterButton() {
        return mageFilterButton;
    }

    public SelenideElement getPaladinFilterButton() {
        return paladinFilterButton;
    }

    public SelenideElement getPriestFilterButton() {
        return priestFilterButton;
    }

    public SelenideElement getRogueFilterButton() {
        return rogueFilterButton;
    }

    public SelenideElement getShamanFilterButton() {
        return shamanFilterButton;
    }

    public ElementsCollection getNumberOfBeastCard() {
        return numberOfBeastCard;
    }

    public SelenideElement getMinionTypeMech() {
        return minionTypeMech;
    }

    public SelenideElement getMinionTypeMurloc() {
        return minionTypeMurloc;
    }

    public SelenideElement getMinionTypeNaga() {
        return minionTypeNaga;
    }

    public SelenideElement getMinionTypePirate() {
        return minionTypePirate;
    }

    public SelenideElement getMinionTypeQuilboar() {
        return minionTypeQuilboar;
    }

    public SelenideElement getMinionTypeTotem() {
        return minionTypeTotem;
    }

    public SelenideElement getFilterButton() {
        return filterButton;
    }

    public ElementsCollection getDhBeastCards() {
        return dhBeastCards;
    }

    public ElementsCollection getDruidBeastCard() {
        return numberOfBeastCard;
    }

    public SelenideElement getDhFilterButton() {
        return dhFilterButton;
    }

    public SelenideElement getClassFilterButton() {
        return classFilterButton;
    }

    public SelenideElement getDruidFilterButton() {
        return druidFilterButton;
    }
}
