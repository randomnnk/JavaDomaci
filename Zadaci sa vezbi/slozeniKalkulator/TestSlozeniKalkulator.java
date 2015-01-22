package slozenikalkulator;

class TestSlozeniKalkulator {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        int suma;
        suma = SlozeniKalkulator.suma(5);
        System.out.println("Suma 5 je "+suma);
        SlozeniKalkulator sk = new SlozeniKalkulator();
        sk.ispisiBrojeveOd1Do100();
    }
}
