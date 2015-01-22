/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package najmanjiceobroj;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class NajmanjiCeoBroj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        
        //Unos brojeva
        System.out.print("Unesite prvi broj : ");
        int a = unos.nextInt();
        
        System.out.print("Unesite drugi broj : ");
        int b = unos.nextInt();
        
        System.out.print("Unesite treci broj : ");
        int c = unos.nextInt();
        
        //Deklaracija prvog broja kao minimum
        int min = a; 
        
        //Odredjivanje najmanjeg unetog broja
        if(b<min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        //Stampanje rezultata
        System.out.println("Najmanji uneti broj je : "+min);
    }
    
}
