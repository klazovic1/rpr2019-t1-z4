package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] supermarket = new Artikl[1000];


    void dodajArtikl(Artikl a){
        for(int i = 0; i<1000; i++){
            if(supermarket[i] == null) {
                supermarket[i] = a;

            }
        }
    }

    Artikl[] getArtikli (){

        return supermarket;

    }

    Artikl izbaciArtiklSaKodom ( String k ){

        Artikl a = null;

        for(int i=0; i<1000-1; i++){
            if(artikli[i] == null) break;
            if( k.equals(supermarket[i].kod) ){
                a = supermarket[i];
                for(int j=i; j<1000-21; j++){
                    supermarket[j] = supermarket[j+1];
                }
            }
        break;
        }
        return a;
    }

}
