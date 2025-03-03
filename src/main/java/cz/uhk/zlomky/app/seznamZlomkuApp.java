package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

public class seznamZlomkuApp {

    public static void main(String[] args) {
        SeznamZlomku seznam = new SeznamZlomku();

        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(2, 3));
        seznam.pridatZlomek(new Zlomek(4, 5));
        seznam.pridatZlomek(new Zlomek(7, 8));

        seznam.vypisZlomky(System.out);
        seznam.odebratZlomek(2);

        System.out.println("-------------");
        seznam.vypisZlomky(System.out);
        seznam.vratZlomek(2);

        System.out.println("-------------");
        seznam.vypisZlomky(System.out);

        Zlomek soucet = seznam.spoctiSoucet();
        System.out.println("-------------");
        System.out.println("Soucet zlomku je: " + soucet.doubleValue());

        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("-------------");
        System.out.println("Prumer zlomku je: " + prumer);
        System.out.println("Prumer zlomku realne je: " + prumer.doubleValue());

    }
}