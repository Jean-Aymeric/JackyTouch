package com.jad.tuning;

import com.jad.car.CarCategory;
import com.jad.car.ICar;

public class CompetitionFin extends AbstractDecoratorCar {
    public CompetitionFin(final ICar car) {
        super(car);
    }


    @Override
    protected String getDecoratedDescription() {
        return "avec des ailerons de compétition ";
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
