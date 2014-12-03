package klasaradio;

    class Radio {
        boolean ukljucen = false;
        int trenutnaStanica = 0;
        
        void promeniStanicuNavise() {
            trenutnaStanica = trenutnaStanica + 1;
        }
        
        void promeniStanicuNanize() {
            trenutnaStanica = trenutnaStanica - 1;
        }
        int vratiTrenutnuStanicu() {
            return trenutnaStanica;
        }
        
        void ukljuci() {
            ukljucen = true;   
        }
        
        void iskljuci() {
            ukljucen = false;
        }
        
        boolean daLiJeUkljucen() {
            return ukljucen;
        }
        
        void ispisi(){
            System.out.println("Trenutna radio stanica je : "+trenutnaStanica);
            System.out.println("Radio je ukljucen : "+ukljucen);
    }
}

    class TestRadio {
    public static void main(String[] args) {
        int trenutna_radio_stanica;
        Radio r = new Radio();
        r.ispisi();
        r.trenutnaStanica = 10;
        r.ispisi();
        r.promeniStanicuNavise();
        r.ispisi();
        r.promeniStanicuNanize();
        r.ispisi();
        r.ukljuci();
        r.ispisi();
        trenutna_radio_stanica = r.vratiTrenutnuStanicu();
        System.out.println("Trenutna radio stanica je : "+trenutna_radio_stanica);
    }
    
}
