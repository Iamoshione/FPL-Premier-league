package com.example.SportyApi.controller.http;


import com.example.SportyApi.model.events.EventWrapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


@Component
public class HttpConnection{

    public JSONObject base() {

        JSONObject data_obj = null;
        try {
            URL url = new URL("https://fantasy.premierleague.com/api/bootstrap-static/");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                scanner.close();

                JSONParser parse = new JSONParser();
                data_obj = (JSONObject) parse.parse(inline);
                System.out.println(data_obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data_obj;
    }

}
