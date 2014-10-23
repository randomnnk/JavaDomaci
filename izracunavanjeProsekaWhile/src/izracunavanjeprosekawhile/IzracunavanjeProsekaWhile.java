/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjeprosekawhile;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeProsekaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Unos brojeva i deklarisanje
        Scanner unos = new Scanner(System.in);
        double suma, prosek, broj;
        int ukupno;
        
        //Unos brojeva
        System.out.println("Unesite brojeve, za kraj upisite nulu!");
        System.out.print("Unesite prvi broj: ");
        broj = unos.nextDouble();
        
        //Vrednosti ukupno i sume
        ukupno = 0;
        suma = broj;
        
        //Petlja
        while(broj!=0)
        {
            ukupno++;
            System.out.print("Unesite naredni broj: ");
            broj = unos.nextDouble();
            suma = suma + broj;
        }
        
        //Izracunavanje i ispisivanje proseka
        prosek = suma/ukupno;
        System.out.println("Prosek iznosi: "+prosek);
    }
    
}
