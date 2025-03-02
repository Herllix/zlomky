package cz.uhk.zlomky.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ZlomekTest {

    @Test
    void krat() {
        Zlomek a = new Zlomek (0, 4);
        Zlomek b = new Zlomek(4, 5);
        Zlomek c = a.krat(b);
        assertEquals(0, c.getCitatel(), "Chybny citatel");
        assertEquals(20, c.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void deleno() {
        //dělení se stejnými jmenovateli
        Zlomek a = new Zlomek (1, 4);
        Zlomek b = new Zlomek (1, 4);
        Zlomek c = a.deleno(b);
        assertEquals(1, c.getCitatel(), "Chybny citatel");
        assertEquals(1, c.getJmenovatel(), "Chybny jmenovatel");

        //dělění s různými jmenovateli
        Zlomek d = new Zlomek (1, 2);
        Zlomek e = new Zlomek (1, 4);
        Zlomek f = d.deleno(e);
        assertEquals(2, f.getCitatel(), "Chybny citatel");
        assertEquals(1, f.getJmenovatel(), "Chybny jmenovatel");

        //dělení s negativními zlomky
        Zlomek g = new Zlomek (-1, 2);
        Zlomek h = new Zlomek (1, 2);
        Zlomek i = g.deleno(h);
        assertEquals(-1, i.getCitatel(), "Chybny citatel");
        assertEquals(1, i.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void plus() {
        //Součet se stejnými jmenovateli
        Zlomek a = new Zlomek (1, 4);
        Zlomek b = new Zlomek (2, 4);
        Zlomek c = a.plus(b);
        assertEquals(3, c.getCitatel(), "Chybny citatel");
        assertEquals(4, c.getJmenovatel(), "Chybný jmenovatel");

        //součet s různými jmenovateli
        Zlomek d = new Zlomek (1, 2);
        Zlomek e = new Zlomek (1, 4);
        Zlomek f = d.plus(e);
        assertEquals(3, f.getCitatel(), "Chybny citatel");
        assertEquals(4, f.getJmenovatel(), "Chybny jmenovatel");

        //součet s nulou
        Zlomek g = new Zlomek (1, 2);
        Zlomek h = new Zlomek (0, 1);
        Zlomek i = g.plus(h);
        assertEquals(1, i.getCitatel(), "Chybny citatel");
        assertEquals(2, i.getJmenovatel(), "Chybny jmenovatel");

        //součet s negativními zlomky
        Zlomek j = new Zlomek (-1, 2);
        Zlomek k = new Zlomek (1, 2);
        Zlomek l = j.plus(k);
        assertEquals(0, l.getCitatel(), "Chybny citatel");
        assertEquals(2, l.getJmenovatel(), "Chybny jmenovatel");
    }

    @Test
    void minus() {
        //odčítání se stejnými jmenovateli
        Zlomek a = new Zlomek (3, 4);
        Zlomek b = new Zlomek (1, 4);
        Zlomek c = a.minus(b);
        assertEquals(1, c.getCitatel(), "Chybny citatel");
        assertEquals(2, c.getJmenovatel(), "Chybny jmenovatel");

        //odčítání s různými jmenovateli
        Zlomek d = new Zlomek (1, 2);
        Zlomek e = new Zlomek (1, 4);
        Zlomek f = d.minus(e);
        assertEquals(1, f.getCitatel(), "Chybny citatel");
        assertEquals(4, f.getJmenovatel(), "Chybny jmenovatel");

        //odčítání s nulou
        Zlomek g = new Zlomek (1, 2);
        Zlomek h = new Zlomek (0, 1);
        Zlomek i = g.minus(h);
        assertEquals(1, i.getCitatel(), "Chybny citatel");
        assertEquals(2, i.getJmenovatel(), "Chybny jmenovatel");

        //odčítání s negatviními zlomky
        Zlomek j = new Zlomek (1, 2);
        Zlomek k = new Zlomek (-1, 4);
        Zlomek l = j.minus(k);
        assertEquals(3, l.getCitatel(), "Chybny citatel");
        assertEquals(4, l.getJmenovatel(), "Chybny jmenovatel");
    }
}