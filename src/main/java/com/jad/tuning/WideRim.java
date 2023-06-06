package com.jad.tuning;

import com.jad.car.CarCategory;
import com.jad.car.ICar;

public class WideRim extends AbstractDecoratorCar {
    public WideRim(final ICar car) {
        super(car);
    }


    @Override
    protected String getDecoratedDescription() {
        return "avec des jantes larges ";
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
