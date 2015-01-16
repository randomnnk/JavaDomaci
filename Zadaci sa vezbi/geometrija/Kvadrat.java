package geometrija;

public class Kvadrat {

    private double stranica;
    
    public Kvadrat(double stranica){
        this.stranica = stranica;
    }
    
    public double getStranica(){
        return stranica;
    }
    
    public void setStranica(double stranica){
        this.stranica = stranica;
    }
    
    double obim(){
        return 4*stranica;
    }
    
    double povrsina(){
        return Math.pow(stranica, 2);
    }
}
