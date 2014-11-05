/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispisivanjejednodimenzionalnogniza;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IspisivanjeJednodimenzionalnogNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] Niz = new int[10];
        
        for(int i = 0; i < Niz.length; i++){
            Niz[i] = i;
            System.out.print(" "+Niz[i]);
        }
        System.out.print("\n");
    }
    
}
