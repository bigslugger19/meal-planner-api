package com.totenet.mealplanner.controller;

import com.totenet.mealplanner.dao.InventoryItemRepository;
import com.totenet.mealplanner.model.InventoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/inventory-item", produces="application/json")
public class InventoryItemController {

    private InventoryItemRepository inventoryItemRepository;

    @Autowired
    public InventoryItemController(InventoryItemRepository inventoryItemRepository) {
        this.inventoryItemRepository = inventoryItemRepository;
    }

    @GetMapping()
    public List<InventoryItem> getInventoryItems() {
        return inventoryItemRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<InventoryItem> getInventoryItemById(@PathVariable String id) {
        return inventoryItemRepository.findById(id);
    }

    @PostMapping()
    public InventoryItem addInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return inventoryItemRepository.save(inventoryItem);
    }

    @PutMapping()
    public InventoryItem updateInventoryItem(@RequestBody InventoryItem inventoryItem) {
        return inventoryItemRepository.save(inventoryItem);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteInventoryItem(@PathVariable String id) {
        inventoryItemRepository.deleteById(id);
    }
}
