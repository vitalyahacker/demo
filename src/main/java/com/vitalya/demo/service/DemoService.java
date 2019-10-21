package com.vitalya.demo.service;

import com.vitalya.demo.model.Item;

import java.util.List;

public interface DemoService {

    Item save(Item item);

    List<Item> findAll();

    void delete(Item item);
}
