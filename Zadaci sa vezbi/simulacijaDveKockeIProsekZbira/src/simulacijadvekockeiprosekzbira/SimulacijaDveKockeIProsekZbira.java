/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacijadvekockeiprosekzbira;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class SimulacijaDveKockeIProsekZbira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Stampanje Zbir i Prosecan broj
        System.out.println("Zbir dve kocke  Prosecan broj bacanja");
        System.out.println("--------------  ---------------------");
        
        for(int i = 2; i <13; i++){
            System.out.printf("%7d%24.2f\n",i,prosekZaZbir(i));
        }
    }
    
    public static int baciZaZbir(int zbir){
        int brojBacanja = 0;
        int kocka1;
        int kocka2;
        
        do{
            kocka1 = (int)(Math.random()*6)+1;
            kocka2 = (int)(Math.random()*6)+1;
            brojBacanja++;
        }
        while((kocka1 + kocka2) != zbir);
        return brojBacanja;
    }
    
    public static double prosekZaZbir(int zbir){
        final int BROJ_PONAVLJANJA = 100000;
        int ukupnoBacanja = 0; 
        
        for(int i = 0; i < BROJ_PONAVLJANJA; i++){
            ukupnoBacanja = ukupnoBacanja + baciZaZbir(zbir);
        }
        return (double)ukupnoBacanja/BROJ_PONAVLJANJA;
    }
}
