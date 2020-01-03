package com.totenet.mealplanner.controller;

import com.totenet.mealplanner.dao.MeasurementUnitRepository;
import com.totenet.mealplanner.model.MeasurementUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/measurement-unit", produces="application/json")
public class MeasurementUnitController {

    private MeasurementUnitRepository measurementUnitRepository;

    @Autowired
    public MeasurementUnitController(MeasurementUnitRepository measurementUnitRepository) {
        this.measurementUnitRepository = measurementUnitRepository;
    }

    @GetMapping()
    public List<MeasurementUnit> getMeasurementUnits() {
        return measurementUnitRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<MeasurementUnit> getMeasurementUnitById(@PathVariable String id) {
        return measurementUnitRepository.findById(id);
    }

    @PostMapping()
    public MeasurementUnit addMeasurementUnit(@RequestBody MeasurementUnit inventoryItem) {
        return measurementUnitRepository.save(inventoryItem);
    }

    @PutMapping()
    public MeasurementUnit updateMeasurementUnit(@RequestBody MeasurementUnit inventoryItem) {
        return measurementUnitRepository.save(inventoryItem);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMeasurementUnit(@PathVariable String id) {
        measurementUnitRepository.deleteById(id);
    }
}
