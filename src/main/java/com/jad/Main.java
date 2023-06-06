package com.jad;

import com.jad.car.FiatPanda;
import com.jad.car.ICar;
import com.jad.car.NissanSkyline;
import com.jad.tuning.ColorNeon;
import com.jad.tuning.CompetitionFin;
import com.jad.tuning.FlamesOnTheSides;
import com.jad.tuning.WideRim;

public enum Main {
    ;

    public static void main(final String[] args) {
        final ICar nissanSkyline =
                new FlamesOnTheSides(new CompetitionFin(new WideRim(new ColorNeon(new NissanSkyline(), "mauve"))));
        final ICar fiatPanda =
                new FlamesOnTheSides(new CompetitionFin(new WideRim(new ColorNeon(new FiatPanda(), "or"))));
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