package com.disaster.management.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.management.entity.Disaster;          // ← ADD THIS LINE
import com.disaster.management.service.DisasterService;

@RestController
@RequestMapping("/api")
public class DisasterController {

    @Autowired
    private DisasterService disasterService;

    @GetMapping("/disasters")
    public List<Disaster> getDisasters() {
        return disasterService.getAllDisasters();
    }

    // New endpoint: real weather for Tamil Nadu cities (no API key needed)
    @GetMapping("/weather")
    public Map<String, Object> getWeather(@RequestParam String city) {
        Map<String, Object> response = new HashMap<>();

        // Tamil Nadu city coordinates
        Map<String, double[]> cities = new HashMap<>();
        cities.put("Coimbatore", new double[]{11.0168, 76.9558});
        cities.put("Dindigul", new double[]{10.3687, 77.9803});
        cities.put("Chennai", new double[]{13.0827, 80.2707});
        cities.put("Madurai", new double[]{9.9252, 78.1198});
        cities.put("Tirunelveli", new double[]{8.7139, 77.7567});
        cities.put("Salem", new double[]{11.6643, 78.1460});
        cities.put("Tiruchirappalli", new double[]{10.7905, 78.7047});

        double[] latLon = cities.getOrDefault(city, new double[]{11.0168, 76.9558}); // default Coimbatore

        try {
            String urlStr = String.format(
                "https://api.open-meteo.com/v1/forecast?latitude=%.4f&longitude=%.4f&current=temperature_2m,apparent_temperature,weather_code,precipitation&timezone=Asia%%2FKolkata",
                latLon[0], latLon[1]
            );

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                content.append(line);
            }
            in.close();
            conn.disconnect();

            response.put("weather", content.toString());
        } catch (Exception e) {
            response.put("error", "Weather fetch failed: " + e.getMessage());
        }

        return response;
    }
}