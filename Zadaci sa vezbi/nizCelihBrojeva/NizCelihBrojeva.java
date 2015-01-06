package nizcelihbrojeva;

class NizCelihBrojeva {
    
    int[] niz;
    int brojac = 0;
    
    NizCelihBrojeva(int kapacitet){
        niz = new int[kapacitet];
    }
    
    void ispisiPrvi(){
        System.out.println(niz[0]);
    }
    
    void ispisiKapacitet(){
        System.out.println(niz.length);
    }
    
    void dodajUNiz(int b){
        if(brojac < niz.length){
            niz[brojac] = b;
            brojac++;
        }
        else System.out.println("Greska! Niz je pun!");
    }
    
    void ispisi(){
        for(int i = 0; i < brojac; i++){
            System.out.println(niz[i]);
        }
    }
    
    boolean daLiSadrzi(int b){
        for(int i = 0; i < brojac; i++){
            if(niz[i] == b) return true;   
        }
        return false;
    }
    
    int zbir(){
        int z = 0;
        for(int i = 0; i < brojac; i++) z = z + niz[i];
        return z;
    }
    
    int maxElement(){
        int max = niz[0];
        for(int i = 0; i < brojac; i++)
            if(niz[i] > max) max = niz[i];
        return max;
    }
}
