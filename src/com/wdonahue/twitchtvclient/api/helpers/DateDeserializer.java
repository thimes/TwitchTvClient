package com.wdonahue.twitchtvclient.api.helpers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by thimes on 3/26/14.
 */
public class DateDeserializer implements JsonDeserializer<Date> {

                                              // Wed Mar 26 07:35:35 2014
    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);

    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonPrimitive json = (JsonPrimitive) jsonElement;

        String createdString = json.getAsString();

        Date retDate = null;

        synchronized (sdf) {
            try {
                retDate = sdf.parse(createdString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return retDate;
    }
}
