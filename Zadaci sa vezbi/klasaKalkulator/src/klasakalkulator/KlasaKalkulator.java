package klasakalkulator;

class Kalkulator{
        int saberi(int x, int y){
            int rezultat = x+y;
            return rezultat;
        }
        
        int oduzmi(int x, int y){
            int rezultat = x-y;
            return rezultat;
        }
        
        int pomnozi(int x, int y){
            int rezultat = x*y;
            return rezultat;
        }
        
        double pomnozi(double x, double y){
            double rezultat = x*y;
            return rezultat;
        }
        double podeli(double x, double y){
            double rezultat = x/y;
            return rezultat;
        }
        
        int podeliDIV(int x, int y){
            int rezultat = x/y;
            return rezultat;
        }
        
        int podeliMOD(int x, int y){
            int rezultat = x%y;
            return rezultat;
        }
        
        void proveraZnaka(int a){
            if(a == 0) System.out.println("Broj "+a+" je jednak nuli!");
            if(a > 0) System.out.println("Broj "+a+" je veci od nule!");
            if(a < 0) System.out.println("Broj "+a+" je manji od nule!" );
            
        }
        
        void proveraAB(int a, int b){
            if(a == 0) System.out.println("Broj "+a+" je jednak broju "+b);
            if(a > 0) System.out.println("Broj "+a+" je veci od broja "+b);
            if(a < 0) System.out.println("Broj "+a+" je manji od broja "+b );
        }
        
        boolean proveraParnosti(int a){
            if((a%2) == 0){
                System.out.println("Broj "+a+" je paran!");
                return true;
            }
            else {
                System.out.println("Broj"+a+" je neparan!");
                return false;
            }
        }
        
        boolean proveraRaspona1(int a){
            if((a >= 100)&& (a <= 200)) return true;
            else return false;
        }
    }

class KlasaKalkulator {
    public static void main(String[] args) {
        
        Kalkulator k = new Kalkulator();
        System.out.println("Rezultat sabiranja je : "+k.saberi(123,23));
        System.out.println("Rezultat oduzimanja je : "+k.oduzmi(10,7));
        System.out.println("Rezultat mnozenja je : "+k.pomnozi(-10,8));
        System.out.println("Rezultat mnozenja je : "+k.pomnozi(5.2,8));
        System.out.println("Rezultat deljenja je "+k.podeli(5.2,2.6));
        System.out.println("Rezultat DIV deljenja je : "+k.podeliDIV(5,2));
        System.out.println("Rezultat DIV deljenja je : "+k.podeliDIV(4,2));
        System.out.println("Rezultat DIV deljenja je : "+k.podeliDIV(10,3));
        System.out.println("Rezultat MOD deljenja je : "+k.podeliMOD(5,2));
        System.out.println("Rezultat MOD deljenja je : "+k.podeliMOD(4,2));
        System.out.println("Rezultat MOD deljenja je : "+k.podeliMOD(11,3));
        k.proveraZnaka(-12);
        k.proveraAB(123,456);
        boolean paran = k.proveraParnosti(33);
        boolean ras1 = k.proveraRaspona1(12);
    }
    
}

