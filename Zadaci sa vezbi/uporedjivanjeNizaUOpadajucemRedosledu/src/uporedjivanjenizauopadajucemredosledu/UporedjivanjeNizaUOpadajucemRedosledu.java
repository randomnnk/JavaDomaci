/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uporedjivanjenizauopadajucemredosledu;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class UporedjivanjeNizaUOpadajucemRedosledu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Odredjivanje niza
        int Niz[] = {50,20,45,82,25,63};
        System.out.print("Elementi niza : ");
        
        for(int i = 0; i < Niz.length; i++){
            System.out.print(" "+Niz[i]);
        }
        System.out.print("\n");
        
        //Sortiranje u opadajucem nizu
        Arrays.sort(Niz);
        for(int i = 0, j = Niz.length-1; i<j; i++, j--){
            int pomocnaVrednost = Niz[i];
            Niz[i] = Niz[j];
            Niz[j] = pomocnaVrednost;
    }   
        System.out.print("Elementi niza u opadajucem redosledu : ");
        for(int i = 0; i < Niz.length; i++){
            System.out.print(" "+Niz[i]);
        }
        System.out.println("\n");
    }
    
}
