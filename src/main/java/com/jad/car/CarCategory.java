package com.jad.car;

public enum CarCategory {
    SPORTIVE("Sportive"),
    SUV("SUV"),
    _4x4("4x4"),
    CITY("Ville");
    private final String name;

    CarCategory(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
