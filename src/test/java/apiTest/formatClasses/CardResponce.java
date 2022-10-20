package apiTest.formatClasses;

public class CardResponce {
    private String cardId;
    private String name;
    private String cardSet;
    private String type;
    private String faction;
    private String rarity;
    private Integer cost;
    private Integer attack;
    private Integer health;
    private String text;
    private String flavor;
    private String artist;
    private Boolean collectible;
    private Boolean elite;
    private String race;
    private String locale;

    public CardResponce() {
    }

    public CardResponce(String cardId, String name, String cardSet, String type, String faction, String rarity,
                        Integer cost, Integer attack, Integer health, String text, String flavor, String artist,
                        Boolean collectible, Boolean elite, String race, String locale) {
        this.cardId = cardId;
        this.name = name;
        this.cardSet = cardSet;
        this.type = type;
        this.faction = faction;
        this.rarity = rarity;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.collectible = collectible;
        this.elite = elite;
        this.race = race;
        this.locale = locale;
    }

    public String getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public String getCardSet() {
        return cardSet;
    }

    public String getType() {
        return type;
    }

    public String getFaction() {
        return faction;
    }

    public String getRarity() {
        return rarity;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getHealth() {
        return health;
    }

    public String getText() {
        return text;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getArtist() {
        return artist;
    }

    public Boolean getCollectible() {
        return collectible;
    }

    public Boolean getElite() {
        return elite;
    }

    public String getRace() {
        return race;
    }

    public String getLocale() {
        return locale;
    }
}
