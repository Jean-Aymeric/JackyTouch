package com.jad.tuning;

import com.jad.car.CarCategory;
import com.jad.car.ICar;

abstract class AbstractDecoratorCar implements ICar {
    private final ICar car;

    public AbstractDecoratorCar(final ICar car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return this.car.getDescription() + this.getDecoratedDescription();
    }

    protected abstract String getDecoratedDescription();

    @Override
    public String getModel() {
        return this.car.getModel() + this.getDecoratedModel();
    }

    @Override
    public CarCategory getCategory() {
        return this.getDecoratedCategory() == null ? this.car.getCategory() : this.getDecoratedCategory();
    }

    protected abstract CarCategory getDecoratedCategory();

    @Override
    public String getInformations() {
        return this.getModel() + " " + this.getCategory().getName() + " " + this.getDescription();
    }

    protected abstract String getDecoratedModel();


}
