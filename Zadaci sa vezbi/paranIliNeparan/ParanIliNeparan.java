/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paranilineparan;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class ParanIliNeparan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Deklaracija i unos broja
        int n; 
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite prirodan broj: ");
        n = unos.nextInt();
        
        //Provera da li je broj paran ili neparan
        if(n % 2 == 0)
        {
            System.out.println("Uneti broj je paran!");
        }
        else 
        {
            System.out.println("Uneti broj je neparan!");
        }
    }
    
}
