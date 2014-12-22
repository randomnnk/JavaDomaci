package analizatorteksta;

class AnalizatorTeksta {
    
    String tekst;
    public AnalizatorTeksta(){
        tekst = "nepoznat";
    }
    
    public AnalizatorTeksta(String t){
        if (t!=null) tekst = t;
        else {
            System.out.println("String koji ste uneli je prazan!");
            tekst = "nepoznat";
        }
    }
    
    void provera (String t){
        if (t==null)
            System.out.println ("Greska: uneti tekst je null");
        else {
            if (tekst.equals(t))
            System.out.println("Tekstovi su jednaki");
        else
            System.out.println("Tekstovi nisu jednaki");
        }
    }
    
    void dodajNaKraj(String novi_tekst){
        tekst = tekst + novi_tekst;
    }

    int brojTacaka(){
        int broj=0;
        for (int i=0; i<tekst.length();i++)
            if (tekst.charAt(i)=='.') broj++;
                return broj;
    }
    
    int brojReci(){
        String[] reci = tekst.split(" ");
        return reci.length;
    }

}
