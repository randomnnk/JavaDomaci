/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjesrednjevrednostiproizvoljnogniza;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeSrednjeVrednostiProizvoljnogNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        
        System.out.print("Unesite broj elemenata niza : ");
        int n = unos.nextInt();
        
        int[] Niz = new int[n];
        
        System.out.println("Unesite vrednosti elemenata niza : ");
        for(int i = 0; i < n; i++){
            Niz[i] = unos.nextInt();
        }
        
        double zbir = 0;
        int brojac = 0;
        
        for(int i = 0; i < n; i++){
            zbir = zbir + Niz[i];
            brojac++;
        }
        
        double prosek = zbir/brojac;
        System.out.println("Srednja vrednost elemenata niza je : ");
        System.out.println(prosek);
    }
    
}
