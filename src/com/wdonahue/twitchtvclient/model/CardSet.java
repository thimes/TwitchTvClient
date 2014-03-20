package com.wdonahue.twitchtvclient.model;

/**
 * Created by thimes on 3/20/14.
 */
public class CardSet {

    private String name;

    private String code;

    private Integer number;

    private Integer cyclenumber;

    private String available;

    private Integer known;

    private Integer total;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCyclenumber() {
        return cyclenumber;
    }

    public void setCyclenumber(Integer cyclenumber) {
        this.cyclenumber = cyclenumber;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Integer getKnown() {
        return known;
    }

    public void setKnown(Integer known) {
        this.known = known;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
