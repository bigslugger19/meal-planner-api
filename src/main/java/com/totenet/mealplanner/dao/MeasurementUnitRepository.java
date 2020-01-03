package com.totenet.mealplanner.dao;

import com.totenet.mealplanner.model.MeasurementUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeasurementUnitRepository extends MongoRepository<MeasurementUnit, String> {

}
