package com.vitalya.demo.controller;

import com.vitalya.demo.model.Item;
import com.vitalya.demo.service.DemoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public List<Item> findAll() {
        return demoService.findAll();
    }

    @PostMapping
    public Item save(@RequestBody Item item) {
        return demoService.save(item);
    }

    @DeleteMapping
    public void delete(@RequestBody Item item) {
        demoService.delete(item);
    }
}
