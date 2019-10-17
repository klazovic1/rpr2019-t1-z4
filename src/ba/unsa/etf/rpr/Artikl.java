package ba.unsa.etf.rpr;

public class Artikl {
    String ime;
    int cijena;
    String kod;

    Artikl (String s, int c, String k){

        this.ime = s;
        this.cijena = c;
        this.kod = k;

    }

    String getNaziv () {
        return ime;
    }
    String getKod (){
        return kod;
    }
    int getCijena () {
        return cijena;
    }





}
