/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenhajticelzijus;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class FarenhajtICelzijus {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Unos i deklracaija
        Scanner unos = new Scanner(System.in);
        double f,c;
        String odabir;
        
        //Odabir paketa
        System.out.println("Za pretvaranje iz Farenhajta u Celzijuse unesite 1.");
        System.out.println("Za pretvaranje iz Celzijusa u Farenhajt unesite 2.");
        System.out.println("Za izlazak unesite 3.");
        
        //Unos
        System.out.print("Unesite zeljeni broj: ");
        odabir = unos.next();
        
        //If i else
        if(odabir.equals("1"))
        {
            System.out.print("Unesite vrednost Farenhajta: ");
            f = unos.nextDouble();
            c = 5*(f-32)/9;
            System.out.println("Vrednost u Celzijusu iznosi: "+c);
        }
            
        else if(odabir.equals("2"))
        {
            System.out.print("Unesite vrednost Celzijusa: ");
            c = unos.nextDouble();
            f = c * 1.8  +32;
            System.out.println("Vrednost u Farenhajtu inzosi: "+f);
        }
            
        else if(odabir.equals("3"))
        {
            System.exit(0);
        }
        
        else 
        {
            System.out.print("Vrednost nije podrzana. Molimo vas da unesete 1,2 ili 3!");
        }
            
            
            
        
        
    }
    
}
