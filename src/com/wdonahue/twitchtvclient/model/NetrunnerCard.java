package com.wdonahue.twitchtvclient.model;

/**
 * Created by thimes on 3/20/14.
 */
public class NetrunnerCard {

    private static final String WEB_ROOT = "http://www.netrunnerdb.com";

    private String title;

    private String imagesrc;

    private String url;

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return WEB_ROOT + imagesrc;
    }

    public String getUrl() {
        return url;
    }
}
