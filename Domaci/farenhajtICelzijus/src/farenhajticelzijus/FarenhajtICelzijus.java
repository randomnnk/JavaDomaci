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
        double f,c,k;
        String odabir;
        
        //Odabir pocetne jedinice
        System.out.println("Odabarite pocetnu jedinicu koju zelite da konvertujete!");
        System.out.println("Za Celzijus unesite 1.");
        System.out.println("Za Kelvin unesite 2."); 
        System.out.println("Za Farenhajt unesite 3.");
        System.out.println("Za izlazak unesite 4.");
        
        //Unos
        System.out.print("Unesite zeljeni broj: ");
        odabir = unos.next();
        
        //If i else
        if(odabir.equals("1"))
        {
            System.out.print("Unesite vrednost u Celzijusu: ");
            c = unos.nextDouble();
            f = c * 1.8  +32;
            k = c + 273.15;
            System.out.println("Vrednost u Farenhajtu inzosi: "+f+"°F");
            System.out.println("Vrednost u Kelvinu iznosi: "+k+"K");
        }
        
        else if(odabir.equals("2"))
        {
            System.out.print("Unesite vrednost u Kelvinu: ");
            k = unos.nextDouble();
            c = k - 273.15;
            f = (k - 273.15) * 9/5 + 32;
            System.out.println("Vrednost u Celzijusu inzosi: "+c+"°C");
            System.out.println("Vrednost u Farenhajtu iznosi: "+f+"°F");
        }
        
        else if(odabir.equals("3"))
        {
            System.out.print("Unesite vrednost u Farenhajtu: ");
            f = unos.nextDouble();
            c = 5*(f - 32)/9;
            k = 5*(f-32)/9 + 273.15;
            System.out.println("Vrednost u Celzijusu iznosi: "+c+"°C");
            System.out.println("Vrednost u Kelvinu iznosi: "+k+"K");   
        }
        
        else if(odabir.equals("4"))
        {
            System.exit(0);
        }
        
        else 
        {
            System.out.println("Vrednost nije podrzana. Molimo vas da unesete 1, 2, 3 ili 4!");
        }
            
            
            
        
        
    }
    
}
