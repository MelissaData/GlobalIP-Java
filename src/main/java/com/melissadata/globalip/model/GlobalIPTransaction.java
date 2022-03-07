package com.melissadata.globalip.model;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GlobalIPTransaction {

    private final String endpoint;

    private String identNumber;
    private String ip;

    public GlobalIPTransaction(){
        endpoint    = "https://globalip.melissadata.net/v4/web/iplocation/doiplocation?";
        identNumber = "";
        ip       = "";
    }

    public String processTransaction(String request) {
        String response = "";
        BufferedReader reader = null;
        try {
            URL url = new URL(request);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String responseBody = reader.lines().collect(Collectors.joining());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject responseObject = gson.fromJson(responseBody, JsonObject.class);
            response = gson.toJson(responseObject);

        } catch (Exception e) {
            System.out.println("Error sending request: \n" + e);
        }

        return response;
    }

    public String generateRequestString() {
        String request = "";
        request = endpoint;
        request += "&id=" + getIdentNumber();
        try {
            if(!getIp().equals(""))
                request += "&ip=" + URLEncoder.encode(getIp(), "UTF-8");

        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding Exception: " +e);
        }

        return request;
    }

    public String getIdentNumber() {
        return identNumber;
    }

    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
