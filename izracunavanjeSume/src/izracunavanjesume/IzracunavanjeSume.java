/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjesume;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeSume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Unos brojeva i deklaracija
        Scanner unos = new Scanner(System.in);
        double suma = 0, temp, prosek; 
        int broj;
        
        //Unos brojeva
        System.out.print("Koliko brojeva zelite da unesete: ");
        broj = unos.nextInt();
        
        //Petlja
        for(int i=1; i<=broj; i++)
        {
            System.out.print("Unesite "+i+". broj: ");
            temp = unos.nextDouble();
            suma = suma + temp;
        }
        
        //Izracunavanje proseka i ispisivanje
        System.out.println("Suma brojeva iznosi: "+suma);
        prosek = suma/broj;
        System.out.println("Prosek brojeva iznosi: "+prosek);
    }
    
}
