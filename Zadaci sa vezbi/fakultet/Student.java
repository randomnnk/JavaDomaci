package fakultet;

public class Student {
    
    private String ime;
    private String prezime;
    private int brojIndeksa;
    
    public String getIme(){
        return ime;
    }
    
    public void setIme(String ime){
        if(ime == null) System.out.println("Greska : Ime ne sme biti null!");
        else this.ime = ime;
    }
    
    public String getPrezime(){
        return prezime;
    }
    
    public void setPrezime(String prezime){
        if(prezime == null) System.out.println("Greska : Prezime ne sme biti null!");
        else this.prezime = prezime;
    }
    
    public int getBrojIndeksa(){
        return brojIndeksa;
    }
    
    public void setBrojIndeksa(int brojIndeksa){
        if(brojIndeksa < 100 && brojIndeksa > 100) System.out.println("Greska : Broj indeksa mora biti veci od 100 i manji od hiljadu!");
        else this.brojIndeksa = brojIndeksa;
    }
}
