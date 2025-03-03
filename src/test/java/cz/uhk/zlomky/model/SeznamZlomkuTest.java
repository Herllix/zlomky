package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {
    SeznamZlomku seznam;
    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        assertEquals(1, seznam.pocetZlomku(), "Pocet zlomku");
    }

    @Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.pridatZlomek(new Zlomek(5, 2));
        seznam.odebratZlomek(1);
        assertEquals(1, seznam.pocetZlomku(), "Pocet zlomku");
    }

    @Test
    void vratZlomek() {
        Zlomek a=new Zlomek(3, 5);
        Zlomek b = new Zlomek(5, 2);
        seznam.pridatZlomek(a);
        seznam.pridatZlomek(b);
        seznam.vratZlomek(1);
        assertEquals(5,b.getCitatel(), "Citatel" );
        assertEquals(2,b.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void vypisZlomky() {
    }

    @Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.pridatZlomek(new Zlomek(2, 1));
        seznam.pridatZlomek(new Zlomek(5, 3));
        assertEquals(64, seznam.spoctiSoucet().zkratit().getCitatel(), "Citatel" );
        assertEquals(15,seznam.spoctiSoucet().zkratit().getJmenovatel(), "jmenovatel");
    }

    @Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(3, 5));
        seznam.pridatZlomek(new Zlomek(2, 1));
        seznam.pridatZlomek(new Zlomek(5, 3));
        assertEquals(64, seznam.spoctiPrumer().zkratit().getCitatel(), "Citatel" );
        assertEquals(45, seznam.spoctiPrumer().zkratit().getJmenovatel(), "Jmenovatel");
    }
}