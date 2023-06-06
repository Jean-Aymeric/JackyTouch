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

        // Todo
        // la possibilité d'ajouter :
        // - des néons de couleurs sous le chassis
        // - des jantes larges
        // - un aileron de compétitions
        // - des flammes sur les cotés
    }
}