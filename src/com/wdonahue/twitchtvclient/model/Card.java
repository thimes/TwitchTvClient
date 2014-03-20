package com.wdonahue.twitchtvclient.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thimes on 3/20/14.
 */
public class Card {

    private static final String WEB_ROOT = "http://www.netrunnerdb.com";

    @SerializedName("last-modified")
    private String last_modified;

    private String code;

    private String title;

    private String type;

    private String type_code;

    private String subtype;

    private String subtype_code;

    private String text;

    private int baselink;

    private String faction;

    private String faction_code;

    private String flavor;

    private String illustrator;

    private int influencelimit;

    private int minimumdecksize;

    private int number;

    private int quantity;

    private String setname;

    private String set_code;

    private String side;

    private String side_code;

    private boolean uniqueness;

    private String url;

    private String imagesrc;

    private String largeimagesrc;

    private int nbopinions;

    private List<Object> opinions = new ArrayList<Object>();

    public String getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(String last_modified) {
        this.last_modified = last_modified;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_code() {
        return type_code;
    }

    public void setType_code(String type_code) {
        this.type_code = type_code;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSubtype_code() {
        return subtype_code;
    }

    public void setSubtype_code(String subtype_code) {
        this.subtype_code = subtype_code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getBaselink() {
        return baselink;
    }

    public void setBaselink(int baselink) {
        this.baselink = baselink;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getFaction_code() {
        return faction_code;
    }

    public void setFaction_code(String faction_code) {
        this.faction_code = faction_code;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public int getInfluencelimit() {
        return influencelimit;
    }

    public void setInfluencelimit(int influencelimit) {
        this.influencelimit = influencelimit;
    }

    public int getMinimumdecksize() {
        return minimumdecksize;
    }

    public void setMinimumdecksize(int minimumdecksize) {
        this.minimumdecksize = minimumdecksize;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSetname() {
        return setname;
    }

    public void setSetname(String setname) {
        this.setname = setname;
    }

    public String getSet_code() {
        return set_code;
    }

    public void setSet_code(String set_code) {
        this.set_code = set_code;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getSide_code() {
        return side_code;
    }

    public void setSide_code(String side_code) {
        this.side_code = side_code;
    }

    public boolean isUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(boolean uniqueness) {
        this.uniqueness = uniqueness;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    public String getLargeimagesrc() {
        return largeimagesrc;
    }

    public void setLargeimagesrc(String largeimagesrc) {
        this.largeimagesrc = largeimagesrc;
    }

    public int getNbopinions() {
        return nbopinions;
    }

    public void setNbopinions(int nbopinions) {
        this.nbopinions = nbopinions;
    }

    public List<Object> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Object> opinions) {
        this.opinions = opinions;
    }

    public String getImagePath() {
        return WEB_ROOT + imagesrc;
    }
}
