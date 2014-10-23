/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjefunkcije;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeFunkcije {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Unos i deklarisanje
        Scanner unos = new Scanner(System.in);
        double x,y,z,f; 
        
        //Unos vrednosti
        System.out.print("Unesite vrednost za x : ");
        x = unos.nextDouble();
        
        System.out.print("Unesite vrednost za y: ");
        y = unos.nextDouble();
        
        System.out.print("Unesite vrednost za z: ");
        z = unos.nextDouble();
        
        //Izracunavanje funckije i ispisivanje
        f = (x+y)*(x+z)*Math.sin(x)/(2*x-y);
        System.out.println("Vrednost fukcije iznosi: "+f);
        
    }
    
}
