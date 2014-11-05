/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jednostavankalkulator;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class JednostavanKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner broj = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        
        //Unos brojeva
        System.out.print("Unesite prvi broj : ");
        float x = broj.nextFloat();
        
        System.out.print("Unesite drugi broj : ");
        float y = broj.nextFloat();
        
        System.out.print("Izaberite zeljenu operaciju +, -, *, / : ");
        String operator = op.nextLine();
        
        //Inicijalizacija promenljive
        float rezultat = 0;
        
        //Kalkulacija
        if(y != 0 && operator !="/"){
            switch(operator){
                case "+" : rezultat = x + y;
                    break;
                case "-" : rezultat = x - y;
                    break;
                case "*" : rezultat = x * y;
                    break;
                case "/" : rezultat = x / y;
                    break;
                default : System.out.print("Uneli ste pogresan znak operacije!");
                    break;
            }
        }
        else{
            System.out.print("Deljenje sa nulom nije moguce!");
        }
        
        //Eksplicitna konverzija
        short s = (short)rezultat;
        int i = (int)rezultat;
        long l = (long)rezultat;
        double d = (double)rezultat;
        
        //Stampanje resenja
        System.out.println("Rezultat : ");
        System.out.println("Short: "+s);
        System.out.println("Int: "+i);
        System.out.println("Long: "+l);
        System.out.println("Float: "+ rezultat);
        System.out.println("Double: "+d);
    }
    
}
