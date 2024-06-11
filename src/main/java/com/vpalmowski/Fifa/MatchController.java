package com.vpalmowski.Fifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;


@RestController
@RequestMapping("/matches")
public class MatchController {
    @Autowired
    private MatchRepo mrepo;


    private String jsonFile="src/main/resources/static/static.json";

    private void saveToFile(List<Matches> matches) {
        ObjectMapper objectMapper = new ObjectMapper();
        try (FileWriter fileWriter = new FileWriter(jsonFile)) {
            objectMapper.writeValue(fileWriter, matches);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/display")
    public List<Matches> getAllMatch() {
            saveToFile(mrepo.findAll());
            return mrepo.findAll();
        }
    }
