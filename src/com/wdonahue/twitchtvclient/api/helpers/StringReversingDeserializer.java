package com.wdonahue.twitchtvclient.api.helpers;

import android.text.TextUtils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by thimes on 3/26/14.
 */
public class StringReversingDeserializer implements JsonDeserializer<String> {
    @Override
    public String deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        String jsonPrimitive = jsonElement.getAsString();

        if (!TextUtils.isEmpty(jsonPrimitive)) {
            return TextUtils.getReverse(jsonPrimitive, 0, jsonPrimitive.length() - 1).toString();
        }

        return null;
    }

}
