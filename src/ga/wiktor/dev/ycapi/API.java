package ga.wiktor.dev.ycapi;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.URL;

public class API {
    private int death;
    private int distance;
    private int time;
    private int brokenfarm;
    private int blockbreak;
    private int itemshop;

    public int getTime(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.time = data.getInt("time");
        return this.time;
    }
    public int getDeath(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.death = data.getInt("death");
        return this.death;
    }
    public int getDistance(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.distance = data.getInt("distance");
        return this.distance;
    }
    public int getBrokenfarm(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.brokenfarm = data.getInt("brokenfarm");
        return this.brokenfarm;
    }
    public int getBlockbreak(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.blockbreak = data.getInt("blockbreak");
        return this.blockbreak;
    }
    public int getItemshop(String name) throws IOException {
        URL url = new URL("https://api.yourcraft.pl/user/"+name);
        JSONTokener tokener = new JSONTokener(url.openStream());
        JSONObject obj = new JSONObject(tokener);
        JSONObject data = obj.getJSONObject("user");

        this.itemshop = data.getInt("itemshop");
        return this.itemshop;
    }
}