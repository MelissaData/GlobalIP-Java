package melissadata.globalip.model;

import org.apache.sling.commons.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

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
        URI uri;
        URL url;
        try {
            uri = new URI(request);
            url = new URL(uri.toURL().toString());

            HttpURLConnection urlConn = (HttpURLConnection)(url.openConnection());

            BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

            StringBuilder jsonResponse = new StringBuilder();
            String inputLine = "";

                while ((inputLine = in.readLine()) != null) {
                    jsonResponse.append(inputLine);
                }
                @SuppressWarnings("deprecation")
                JSONObject test = new JSONObject(jsonResponse.toString());
                response = test.toString(10);

        } catch (Exception e){
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
