package com.wdonahue.twitchtvclient.api.helpers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.wdonahue.twitchtvclient.model.Game;

import java.lang.reflect.Type;

/**
 * Created by thimes on 3/26/14.
 */
public class GameDeserializer implements JsonDeserializer<Game> {
    @Override
    public Game deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonPrimitive json = (JsonPrimitive) jsonElement;

        String gameString = json.getAsString();

        Game parsedGame = Game.fromApi(gameString);

        return parsedGame;
    }
}
