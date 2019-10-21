package com.vitalya.demo.service;

import com.vitalya.demo.model.Item;
import com.vitalya.demo.repo.DemoRepo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultDemoService implements DemoService {
    private final DemoRepo repository;

    public DefaultDemoService(DemoRepo repository) {
        this.repository = repository;
    }

    @Override
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    public List<Item> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Item item) {
        repository.delete(item);
    }
}
