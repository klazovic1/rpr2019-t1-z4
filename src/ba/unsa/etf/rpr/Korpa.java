package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli = new Artikl[50];


    boolean dodajArtikl(Artikl a){
        for(int i = 0; i<50; i++){
            if(artikli[i] == null) {
                artikli[i] = a;


                return true;
            }
        }
        return false;
    }

    Artikl[] getArtikli (){

        return artikli;

    }

    Artikl izbaciArtiklSaKodom ( String k ){

        Artikl a = null;

        for(int i=0; i<50-1; i++){
            if(artikli[i] == null) break;
            if( k.equals(artikli[i].kod) ){
                a = artikli[i];
                for(int j=i; j<50-2; j++){
                    artikli[j] = artikli[j+1];
                }
            }
        break;
        }

        return a;
    }

    int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for(int i=0; i<50; i++){
            if(artikli[i] == null)
                break;

            cijena = cijena + artikli[i].cijena;
        }
        return cijena;
    }



}
