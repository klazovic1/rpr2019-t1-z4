package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket sm = new Supermarket ();
        sm.dodajArtikl(new Artikl("asd", 5, "123"));

        int br=0;
        for(int i=0; i<50; i++){
            if(sm.supermarket[i] == null)
                break;
            br++;
        }

        assertEquals(1, br);
    }

    @Test
    void getArtikli() {
    }

    @Test
    void izbaciArtiklSaKodom() {

        Supermarket sm = new Supermarket();
        sm.dodajArtikl(new Artikl("asd", 5, "123"));
        sm.dodajArtikl(new Artikl("asd", 5, "124"));
        assertNull(sm.izbaciArtiklSaKodom("125"));

    }
}