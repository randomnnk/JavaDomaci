/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjenzd;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IzracunavanjeNZD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Unos
        Scanner unos = new Scanner(System.in);
        
        //Stampanje opisa
        System.out.println("Unesite dva pozitivna cela broja!");
        
        System.out.print("Unesite prvi (i pritisnite enter) : ");       
        int x = unos.nextInt();
        
        System.out.print("Unesite drugi (i pritisnite enter) : ");
        int y = unos.nextInt();
        
        System.out.println("NZD("+x+","+y+")="+NZD(x,y));
    }
    
    public static int NZD(int x, int y){
        
        if(x >= y){
            int t = x;
            x = y;
            y = t;
        }
        
        int z;
        while(true){
            z = x % y;
            if(z == 0) break;
            x = y;
            y = z;
        }
        return y;
    }
    
}
