package cz.uhk.zlomky.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ZlomekTest {

    @Test
    void getCitatel() {
        assert(false);
    }

    @Test
    void getJmenovatel() {
        assert(false);
    }

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
        assert(false);
    }

    @Test
    void plus() {
        assert(false);
    }

    @Test
    void minus() {
        assert(false);
    }

    @Test
    void zkratit() {
        assert(false);
    }
}