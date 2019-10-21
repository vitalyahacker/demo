package com.vitalya.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping
    public List<String> findAll() {
        return Arrays.asList("Vova", "Vitya", "Vitalya");
    }
}
