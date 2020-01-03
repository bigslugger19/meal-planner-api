package com.totenet.mealplanner.dao;

import com.totenet.mealplanner.model.InventoryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryItemRepository extends MongoRepository<InventoryItem, String> {
}
