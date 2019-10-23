package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {

        Korpa korpa = new Korpa ();
        assertTrue(korpa.dodajArtikl(new Artikl("asd", 5, "123")));

    }

    @Test
    void getArtikli() {
        Korpa korpa1 = new Korpa();
        Korpa korpa2 = new Korpa();
        for(int i=0; i<50; i++){
            korpa1.dodajArtikl(new Artikl("asd", 5, "123"));
            korpa2.dodajArtikl(new Artikl("asd", 5, "123"));
        }

        assertArrayEquals(korpa1.getArtikli(), korpa2.getArtikli());


    }

    @Test
    void izbaciArtiklSaKodom() {

        Korpa korpa1 = new Korpa();
        korpa1.dodajArtikl(new Artikl("asd", 5, "123"));
        korpa1.dodajArtikl(new Artikl("asd", 5, "124"));
        assertNull(korpa1.izbaciArtiklSaKodom("125"));

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("asd", 5, "123"));
        korpa.dodajArtikl(new Artikl("asd", 6, "123"));

        assertEquals ( 11, korpa.dajUkupnuCijenuArtikala());

    }
}