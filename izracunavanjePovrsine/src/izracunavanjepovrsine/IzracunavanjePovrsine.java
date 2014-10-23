/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjepovrsine;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjePovrsine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double stranicaA, stranicaB, povrsina;
        Scanner unos = new Scanner(System.in);
        
        //Unosenje prve stranice
        System.out.print("Unesite stranicu a: ");
        stranicaA = unos.nextDouble();
        
        //Unosenje druge stranice
        System.out.print("Unesite stranicu b: ");
        stranicaB = unos.nextDouble();
        
        //Izracunavanje i ispisivanje
        povrsina = stranicaA * stranicaB;
        System.out.print("Povrsina pravougaonika iznosi: "+povrsina);
    }
    
}
