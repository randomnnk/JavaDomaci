package konvertertemperature;

/**
 * @author Stefan S. Ivić
 */

import java.util.*;
public class KonverterTemperature {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Deklaracija
        Scanner unos = new Scanner(System.in);
        String odabir;
        
        //Naslov
        System.out.println("JAVA - TEMPERATURNI KONVERTOR.");
        System.out.println("==============================");
        
        //Odabir pocetne jedinice
        System.out.println("Pocetne jedinice za konverziju.");
        System.out.println("Za Celzijus unesite c. \nZa Farenhajt unesite f.\nZa Kelvin unesite k.");
              
        do
        {
          //Unos
          System.out.println("===================================================");
          System.out.print("Unesite željenu jedinicu za koverziju (c, f, k): ");
          odabir = unos.nextLine();  
          
          if(odabir.equals("c")){
           celzijus();
           System.out.print("Da li zelite da unesete novu vrednost ? (d,n): ");
           odabir = unos.nextLine();
          }
          else if(odabir.equals("f")){
              farenhajt();
              System.out.print("Da li zelite da unesete novu vrednost ? (d,n): ");
              odabir = unos.nextLine();
          }
          else if(odabir.equals("k")){
              kelvin();
              System.out.print("Da li zelite da unesete novu vrednost ? (d,n): ");
              odabir = unos.nextLine();
          }
          else{
              System.out.println("Uneta vrednost nije podrzana. Unesite c, f ili k.");
          }
        }while(odabir.equals("d"));
    }
    
    public static void celzijus(){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite vrednost u Celzijusu: ");
        double c = unos.nextDouble();
        double f = c * 1.8  +32;
        double k = c + 273.15;
        System.out.println("Vrednost u Farenhajtu inzosi: "+f+"°F");
        System.out.println("Vrednost u Kelvinu iznosi: "+k+"K"); 
    }
    
    public static void farenhajt(){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite vrednost u Farenhajtu: ");
        double f = unos.nextDouble();
        double c = 5*(f - 32)/9;
        double k = 5*(f-32)/9 + 273.15;
        System.out.println("Vrednost u Celzijusu iznosi: "+c+"°C");
        System.out.println("Vrednost u Kelvinu iznosi: "+k+"K");
    }
    
    public static void kelvin(){
        Scanner unos = new Scanner(System.in);
        System.out.print("Unesite vrednost u Kelvinu: ");
        double k = unos.nextDouble();
        double c = k - 273.15;
        double f = (k - 273.15) * 9/5 + 32;
        System.out.println("Vrednost u Celzijusu iznosi: "+c+"°C");
        System.out.println("Vrednost u Farenhajtu iznosi: "+k+"°F");
    }
}