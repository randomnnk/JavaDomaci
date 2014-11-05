/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogadjanjenasimicnoodabranogbroja;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class PogadjanjeNasimicnoOdabranogBroja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Indikator nastavka igre i unos
        String ponovo;
        Scanner unos = new Scanner(System.in);
        
        //Stampanje opisa igre
        System.out.println("Ovo je igra pogadjanja broja.");
        System.out.println("Program ce\" zamisliti\" neki broj izmedju 1 i 100");
        System.out.println("Vi treba da pogodite taj broj.\n");
        
        do{
            pogodiBroj();
            System.out.print("Zelite li ponovo da igrate(d/n) : ");
            ponovo = unos.nextLine();
        }
        while(ponovo.equals("d"));
        System.out.println("Hvala sto ste se igrali!");
    }
    
    public static void pogodiBroj(){
        
        //Deklarisanje brojeva
        int zamisljenBroj;
        int korisnikBroj;
        
        Scanner broj = new Scanner(System.in);
        zamisljenBroj = (int)(100*Math.random())+1;
        
        //Petlja
        do{
            System.out.print("Pogodite broj: ");
            korisnikBroj = broj.nextInt();
            
            if(korisnikBroj < zamisljenBroj){
                System.out.println("Zamislio sam veci broj!");
            }
            else if(korisnikBroj > zamisljenBroj){
                System.out.println("Zamislio sam manji broj!");
            }
            else{
                System.out.println("Bravo, pogodili ste broj!");
            }
        }
        while(korisnikBroj != zamisljenBroj);
    }
}
