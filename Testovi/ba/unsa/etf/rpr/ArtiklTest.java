package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {

        assertEquals( "tenk" , new Artikl("tenk" , 5, "123").getNaziv());

    }

    @Test
    void getKod() {

        assertEquals( "25123" , new Artikl("avion", 6, "25123").getKod());

    }

    @Test
    void getCijena() {

        assertEquals( 5, new Artikl("avion", 5, "23").getCijena());

    }
}