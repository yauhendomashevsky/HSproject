package apiTest.formatClasses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardByRace {

    private String cardId;
    private Integer dbfId;
    private String name;
    private String cardSet;
    private String type;
    private String rarity;
    private Integer cost;
    private Integer attack;
    private Integer health;
    private String text;
    private String flavor;
    private String artist;
    private Boolean collectible;
    private String race;
    private String playerClass;
    private String locale;
    private ArrayList<Mechanic> mechanics;

    public CardByRace(String cardId, Integer dbfId, String name, String cardSet, String type, String rarity,
                      Integer cost, Integer attack, Integer health, String text, String flavor, String artist,
                      Boolean collectible, String race, String playerClass, String locale, ArrayList<Mechanic> mechanics)
    {
        this.mechanics = mechanics;
        this.cardId = cardId;
        this.dbfId = dbfId;
        this.name = name;
        this.cardSet = cardSet;
        this.type = type;
        this.rarity = rarity;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.collectible = collectible;
        this.race = race;
        this.playerClass = playerClass;
        this.locale = locale;
    }

    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(ArrayList<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Integer getDbfId() {
        return dbfId;
    }

    public void setDbfId(Integer dbfId) {
        this.dbfId = dbfId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Boolean getCollectible() {
        return collectible;
    }

    public void setCollectible(Boolean collectible) {
        this.collectible = collectible;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
