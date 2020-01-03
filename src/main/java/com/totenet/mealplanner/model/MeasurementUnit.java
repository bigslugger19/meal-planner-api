package com.totenet.mealplanner.model;

import org.springframework.data.annotation.Id;

public class MeasurementUnit {

    @Id
    private String id;
    private String name;

    public MeasurementUnit() {}

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

    @Override
    public String toString() {
        return String.format(
                "MeasurementUnit[id=%s, name='%s']",
                id, name);
    }
}
