package com.example.d_d_api.services;

import com.example.d_d_api.models.ClassModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {
    private final RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://www.dnd5eapi.co/api/classes";

    public ClassModel getClasseByIndex(String index) {
        try {
            String url = apiUrl + "/" + index;

            return restTemplate.getForObject(url, ClassModel.class);
        } catch (HttpClientErrorException e) {
            return null;
        }
    }

    public List<ClassModel> getClasses() {
        Map<String, Object> response = restTemplate.getForObject(apiUrl, Map.class);
        List<ClassModel> classes = (List<ClassModel>) response.get("results");
        return classes;
    }

    public HashMap<String, String> sobre() {
        HashMap<String, String> info = new HashMap<>();
        info.put("projeto", "API D&D");
        info.put("nome", "Gustavo Goulart");
        info.put("codigo", "202222216");

        return info;
    }
}