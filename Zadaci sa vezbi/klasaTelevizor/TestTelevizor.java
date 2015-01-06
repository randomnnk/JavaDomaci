package klasatelevizor;


    class Televizor {
        
        int jacinaTona = 0;
        boolean ukljucen = false;
        
        void pojacajTon(){
            jacinaTona = jacinaTona + 1;
        }
        
        void smanjiTon(){
            jacinaTona = jacinaTona - 1;
        }
        
        void iskljuciTon(){
            jacinaTona = 0;
        }
        
        void iskljuci(){
            ukljucen = false;
        }
        
        void ukljuci() {
            ukljucen = true;
        }
        
        boolean daLiJeUkljucen() {
            return ukljucen;
        }
        
        int vratiJacinuTona() {
            return jacinaTona;
        }
        
        void ispisi(){
            System.out.println("Jacina tona je : "+jacinaTona);
            System.out.println("Televizor je ukljucen : "+ukljucen);
        }
    }
     
    class TestTelevizor {
    public static void main(String[] args) {
        Televizor t = new Televizor();
        int trenutna_jacina_tona;
        t.ispisi();
        t.jacinaTona = 5;
        t.ispisi();
        t.pojacajTon();
        t.ispisi();
        t.smanjiTon();
        t.ispisi();
        t.ukljuci();
        t.ispisi();
        trenutna_jacina_tona = t.vratiJacinuTona();
        System.out.println("Trenutno, jacina tona na televizoru iznosi "+trenutna_jacina_tona);
        
    }
    }
    

