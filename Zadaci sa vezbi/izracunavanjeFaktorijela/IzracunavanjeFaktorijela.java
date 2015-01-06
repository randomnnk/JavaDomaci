/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjefaktorijela;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeFaktorijela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Unos i deklarisanje
        Scanner unos = new Scanner(System.in);
        int n, faktorijel = 1, i = 1;
        
        //Unos faktorijela i izracunavanje
        System.out.print("Unesite broj za koji izracunavamo faktorijel: ");
        n = unos.nextInt();
        
        //Do
        do
        {
            faktorijel = faktorijel * i;
            i++;
        }
        while (i<=n);
        System.out.println(n+"! iznosi: "+ faktorijel);
    }
    
}
