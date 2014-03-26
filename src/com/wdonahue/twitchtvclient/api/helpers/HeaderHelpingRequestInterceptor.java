package com.wdonahue.twitchtvclient.api.helpers;

import retrofit.RequestInterceptor;

/**
 * Created by thimes on 3/26/14.
 */
public class HeaderHelpingRequestInterceptor implements RequestInterceptor {

    private static final String COOKIE_HEADER_KEY = "Cookie";
    private static final String USER_AGENT_HEADER_KEY = "User-Agent";

    private String mCookie;
    private String mUserAgentString;

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader(USER_AGENT_HEADER_KEY, mUserAgentString);
        if (mCookie != null) {
            request.addHeader(COOKIE_HEADER_KEY, mCookie);
        }
    }

    public void setCookie(String cookie) {
        mCookie = cookie;
    }

    public void clearCredentials() {
        mCookie = null;
    }

    public void setUserAgentInfo(String packageName, int version, String deviceId) {
        mUserAgentString = "TwitchTvClient/" + version + " (android/" + packageName + " id/" + deviceId + ")";
    }
}

