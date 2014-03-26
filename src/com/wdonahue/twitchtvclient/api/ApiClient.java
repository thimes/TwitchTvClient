package com.wdonahue.twitchtvclient.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wdonahue.twitchtvclient.api.helpers.DateDeserializer;
import com.wdonahue.twitchtvclient.api.helpers.GameDeserializer;
import com.wdonahue.twitchtvclient.api.helpers.HeaderHelpingRequestInterceptor;
import com.wdonahue.twitchtvclient.model.Game;
import com.wdonahue.twitchtvclient.model.JustinTvStreamData;

import java.util.Date;
import java.util.List;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

public class ApiClient {
    private static TwitchTvApiInterface sTwitchTvService;

    private static RequestInterceptor requestInterceptor = new HeaderHelpingRequestInterceptor();

    public static TwitchTvApiInterface getTwitchTvApiClient() {
        if (sTwitchTvService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setConverter(getConverter())
                    .setRequestInterceptor(requestInterceptor)
                    .setEndpoint("http://api.justin.tv/api")
                    .build();

            sTwitchTvService = restAdapter.create(TwitchTvApiInterface.class);
        }

        return sTwitchTvService;
    }

    private static Converter getConverter() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, new DateDeserializer());
        builder.registerTypeAdapter(Game.class, new GameDeserializer());
//        builder.registerTypeAdapter(String.class, new StringReversingDeserializer());
        Gson gson = builder.create();

        GsonConverter converter = new GsonConverter(gson);
        return converter;
    }

    public interface TwitchTvApiInterface {
        @GET("/stream/list.json")
        void getStreams(@Query("limit") int limit, @Query("offset") int offset, Callback<List<JustinTvStreamData>> callback);
    }
}
