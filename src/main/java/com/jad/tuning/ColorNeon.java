package com.jad.tuning;

import com.jad.car.CarCategory;
import com.jad.car.ICar;

public abstract class ColorNeon extends AbstractDecoratorCar {
    private final String color;

    public ColorNeon(final ICar car, final String color) {
        super(car);
        this.color = color;
    }


    @Override
    protected String getDecoratedDescription() {
        return "avec des néons de couleur " + this.color + " ";
    }

    @Override
    protected CarCategory getDecoratedCategory() {
        return null;
    }

    @Override
    protected String getDecoratedModel() {
        return "";
    }
}
