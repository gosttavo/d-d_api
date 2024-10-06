package com.example.d_d_api.controllers;

import com.example.d_d_api.models.ClassModel;
import com.example.d_d_api.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MainController {
    @Autowired
    MainService mainService;

    @PostMapping("/class")
    @ResponseBody
    public ResponseEntity<ClassModel> getClassByIndex(@RequestBody Map<String, String> request) {
        String index = request.get("index");
        ClassModel classModel = mainService.getClasseByIndex(index);

        if (classModel == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Class not found");
        }
        return new ResponseEntity<>(classModel, HttpStatus.OK);
    }

    @GetMapping("/classes")
    @ResponseBody
    public List<ClassModel> getClasses() {
        return mainService.getClasses();
    }

    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> sobre() {
        return mainService.sobre();
    }
}