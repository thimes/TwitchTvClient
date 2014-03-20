package com.wdonahue.twitchtvclient.api;

import com.wdonahue.twitchtvclient.model.NetrunnerCard;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;

public class ApiClient2 {
    private static NetrunnerDbApiInterface sService;

    public static NetrunnerDbApiInterface getNetrunnerDBApiClient() {
        if (sService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://netrunnerdb.com/api")

                    .build();

            sService = restAdapter.create(NetrunnerDbApiInterface.class);
        }

        return sService;
    }

    public interface NetrunnerDbApiInterface {
        @GET("/cards")
        void getCards(Callback<List<NetrunnerCard>> callback);
    }
}
