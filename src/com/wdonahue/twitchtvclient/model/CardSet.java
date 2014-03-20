package com.wdonahue.twitchtvclient.model;

/**
 * Created by thimes on 3/20/14.
 */
public class CardSet {

    private String name;

    private String code;

    private int number;

    private int cyclenumber;

    private String available;

    private int known;

    private int total;

    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCyclenumber() {
        return cyclenumber;
    }

    public void setCyclenumber(int cyclenumber) {
        this.cyclenumber = cyclenumber;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public int getKnown() {
        return known;
    }

    public void setKnown(int known) {
        this.known = known;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
