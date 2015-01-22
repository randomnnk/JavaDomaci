package klasabmikalkulator;

class BMIKalkulator {
    double izracunajBMI(double visina, double tezina){
        if((visina < 1.2) || (visina > 2.4)){
            System.out.println("Greska : visina je van granica 1.2 - 2.4 metara!");
            return 0;
        }
        if((tezina < 30) || (tezina > 200)){
            System.out.println("Greska : tezina je van granica 30 - 200 kilograma!");
            return 0;
        }
        double rezultat = (tezina/(visina*visina));
        return rezultat;
    }
    
    void ispisiBMIKategoriju (double bmi){
        if(bmi <= 15) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : anoreksicni!");
        if((bmi > 15) && (bmi <=18.5)) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : mrsavi!");
        if((bmi > 18.5) && (bmi <= 25)) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : normalni!");
        if((bmi > 25) && (bmi <= 30)) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : popunjeni!");
        if((bmi > 30) && (bmi <= 40)) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : debeli!");
        if(bmi > 40) System.out.println("Vas BMI je : "+bmi+" vi pripadate grupi : gojazni!");
    }
}

class KlasaBMIKalkulator {
    public static void main(String[] args) {
        BMIKalkulator bk = new BMIKalkulator();
        double bmi = bk.izracunajBMI(1.86, 81.9);
        bk.ispisiBMIKategoriju(bmi);
    }
    
}
