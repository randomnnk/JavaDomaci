/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namanjielementjednodimenzionalnogniza;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class NamanjiElementJednodimenzionalnogNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner unos = new Scanner(System.in);
        
        System.out.print("Unesite broj elemenata niza: ");
        int n = unos.nextInt();
        
        int[] Niz = new int[n];
        
        System.out.println("Unesite vrednost elemenata niza: ");
        for(int i = 0; i < n; i++){
            Niz[i] = unos.nextInt();
        }
        int min = Niz[0];
        
        for(int i = 1; i < n; i++){
            if(Niz[i] < min){
                min = Niz[i];
            }
        System.out.print("Minimum niza unetih brojeva je: ");
        System.out.println(min); 
        }
    }
    
}
