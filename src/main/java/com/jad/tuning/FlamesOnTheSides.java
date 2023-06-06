package com.jad.tuning;

import com.jad.car.CarCategory;
import com.jad.car.ICar;

public class FlamesOnTheSides extends AbstractDecoratorCar {
    public FlamesOnTheSides(final ICar car) {
        super(car);
    }


    @Override
    protected String getDecoratedDescription() {
        return "avec des flammes sur les cotés ";
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
