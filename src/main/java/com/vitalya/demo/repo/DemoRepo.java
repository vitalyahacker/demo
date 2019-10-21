package com.vitalya.demo.repo;

import com.vitalya.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<Item, Long> {
}
