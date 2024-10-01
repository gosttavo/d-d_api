package com.example.d_d_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainController {
    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        HashMap<String, String> info = new HashMap<>();
        info.put("projeto", "API D&D");
        info.put("nome", "Gustavo Goulart");
        info.put("codigo", "202222216");

        return info;
    }
}
