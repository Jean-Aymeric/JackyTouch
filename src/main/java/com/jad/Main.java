package com.jad;

import com.jad.car.FiatPanda;
import com.jad.car.ICar;
import com.jad.car.NissanSkyline;

public class Main {
    public static void main(String[] args) {
        ICar nissanSkyline = new NissanSkyline();
        ICar fiatPanda = new FiatPanda();
        System.out.println(nissanSkyline.getInformations());
        System.out.println(fiatPanda.getInformations());
    }
}