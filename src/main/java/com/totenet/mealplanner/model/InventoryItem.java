package com.totenet.mealplanner.model;

import org.springframework.data.annotation.Id;

public class InventoryItem {

    @Id
    private String id;
    private String name;
    private Integer quantityOnHand;
    private MeasurementUnit measurementUnit;

    public InventoryItem() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(Integer quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    @Override
    public String toString() {
        return String.format(
                "InventoryItem[id=%s, name=%s, quantityOnHand='%s', measurementUnit='%s']",
                id, name, quantityOnHand, measurementUnit.toString());
    }
}
