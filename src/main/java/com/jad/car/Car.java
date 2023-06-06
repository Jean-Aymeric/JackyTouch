package com.jad.car;

public abstract class Car implements ICar {
    private final String description;
    private final String model;
    private final CarCategory category;

    public Car(final String description, final String model, final CarCategory category) {
        this.description = description;
        this.model = model;
        this.category = category;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public CarCategory getCategory() {
        return this.category;
    }

    @Override
    public String getInformations() {
        return this.model + " " + this.category.getName() + " " + this.description;
    }
}
