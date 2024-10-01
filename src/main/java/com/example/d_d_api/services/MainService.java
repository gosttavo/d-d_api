package com.example.d_d_api.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {
    private final RestTemplate restTemplate;

    public MainService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public HashMap<String, ArrayList<HashMap<String,String>>> getClasses(String index) {
        String url = "https://www.dnd5eapi.co/api/classes"; // URL para obter todas as classes
        Map<String, Object> response = restTemplate.getForObject(url, Map.class); // Fazendo a requisição

        HashMap<String, ArrayList<HashMap<String, String>>> result = new HashMap<>();
        ArrayList<HashMap<String, String>> classesList = new ArrayList<>();

        if (response != null && response.containsKey("results")) {
            List<Map<String, String>> results = (List<Map<String, String>>) response.get("results");
            for (Map<String, String> dndClass : results) {
                HashMap<String, String> classMap = new HashMap<>();
                classMap.put("index", dndClass.get("index"));
                classMap.put("name", dndClass.get("name"));
                classesList.add(classMap);
            }
        }

        result.put("classes", classesList); // Adiciona a lista de classes ao HashMap
        return result;
    }
}
