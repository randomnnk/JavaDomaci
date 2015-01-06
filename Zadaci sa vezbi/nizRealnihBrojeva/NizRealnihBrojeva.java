package nizrealnihbrojeva;

class NizRealnihBrojeva {
    
    double[] niz;
    int brojac = 0;
    
    NizRealnihBrojeva(int kapacitet){
        niz = new double[kapacitet];
    }
    
    void dodajUNiz(double b){
        if(brojac < niz.length){
            niz[brojac] = b;
            brojac++;
        }
        else System.out.println("Greska! Niz je pun!");
    }
    
    void ispisiProizvod(){
        double p = 1;
        for(int i = 0; i < brojac; i++) p = p*niz[i];
        System.out.println(p);
    }
    
    void ispisiMinElement(){
        double min = niz[0];
        for(int i = 0; i < brojac; i++)
            if(niz[i] < min) min = niz[i];
                System.out.println(min);
    }
}
