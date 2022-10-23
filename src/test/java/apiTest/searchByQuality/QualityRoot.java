package apiTest.searchByQuality;

import java.util.ArrayList;

public class QualityRoot {
    private String cardId;
    private int dbfId;
    private String name;
    private String cardSet;
    private String type;
    private String rarity;
    private int cost;
    private int attack;
    private int health;
    private int durability;
    private String text;
    private String flavor;
    private String artist;
    private boolean collectible;
    private boolean elite;
    private String playerClass;
    private String img;
    private String imgGold;
    private String locale;
    private ArrayList<QualityMechanic> mechanics;

    public QualityRoot(String cardId, int dbfId, String name, String cardSet, String type, String rarity,
                       int cost, int attack, int health, int durability, String text, String flavor,
                       String artist, boolean collectible, boolean elite, String playerClass, String img,
                       String imgGold, String locale, ArrayList<QualityMechanic> mechanics) {
        this.cardId = cardId;
        this.dbfId = dbfId;
        this.name = name;
        this.cardSet = cardSet;
        this.type = type;
        this.rarity = rarity;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.durability = durability;
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.collectible = collectible;
        this.elite = elite;
        this.playerClass = playerClass;
        this.img = img;
        this.imgGold = imgGold;
        this.locale = locale;
        this.mechanics = mechanics;
    }

    public String getCardId() {
        return cardId;
    }

    public int getDbfId() {
        return dbfId;
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

    public String getRarity() {
        return rarity;
    }

    public int getCost() {
        return cost;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public int getDurability() {
        return durability;
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

    public boolean isCollectible() {
        return collectible;
    }

    public boolean isElite() {
        return elite;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public String getImg() {
        return img;
    }

    public String getImgGold() {
        return imgGold;
    }

    public String getLocale() {
        return locale;
    }

    public ArrayList<QualityMechanic> getMechanics() {
        return mechanics;
    }
}
