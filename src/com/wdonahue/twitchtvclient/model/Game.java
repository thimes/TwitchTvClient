package com.wdonahue.twitchtvclient.model;

/**
 * Created by thimes on 3/26/14.
 */
public enum Game {
    DOTA_2,
    STARCRAFT_2,
    LEAGUE_OF_LEGENDS,
    ANDROID_NETRUNNER,
    COUNTER_STRIKE,
    DIABLO_III,
    WOW_MOP,
    UNKNOWN,;

    public static Game fromApi(String gameString) {
        if ("Dota 2".equals(gameString)) {
            return DOTA_2;
        } else if ("StarCraft II: Heart of the Swarm".equals(gameString)) {
            return STARCRAFT_2;
        } else if ("League of Legends".equals(gameString)) {
            return LEAGUE_OF_LEGENDS;
        } else if ("Android:Netrunner".equals(gameString)) {
            return ANDROID_NETRUNNER;
        } else if ("Counter-Strike: Global Offensive".equals(gameString)) {
            return COUNTER_STRIKE;
        } else if ("Diablo III: Reaper of Souls".equals(gameString)) {
            return DIABLO_III;
        } else if ("World of Warcraft: Mists of Pandaria".equals(gameString)) {
            return WOW_MOP;
        }
        return UNKNOWN;
    }

    public String getDescription() {
        switch (this) {
            case DOTA_2:
                return "I have no idea...";
            case STARCRAFT_2:
                return "space marines and space bugs!";
            case LEAGUE_OF_LEGENDS:
                return "HEROS, YESSSS!";
            case ANDROID_NETRUNNER:
                return "card games are boring";
            case COUNTER_STRIKE:
                return "wasn't this called half life?";
            case DIABLO_III:
                return "digital dungeon crawling";
            case WOW_MOP:
                return "that wow card game";
            case UNKNOWN:
            default:
                return "does not compute";
        }
    }
}
