/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prebrojavanjeodredjenihreciutekstu;

/**
 *
 * @author Ivke
 */
public class PrebrojavanjeOdredjenihReciUTekstu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // <editor-fold desc="Tekst koji analiziramo">         
        String tekst = "Bio jednom jedan lav. "
                     + "Kakav lav? "
                     + "Strašan lav, narogušen i ljut sav."
                     + "Strašno, strašno! "
                     + "Ne pitajte šta je jeo, "
                     + "taj je jeo šta je hteo - "
                     + "tramvaj ceo i oblaka jedan deo. "
                     + "Strašno, strašno! ";
        // </editor-fold>
        
        int brojačLav = 0;
        int brojačJe = 0;
        String Lav = "lav";
        String Je = "je";
        int indeks = -1;
        
        //Pronalaženje prve pojave reči "lav"
        indeks = tekst.indexOf(Lav);
        while(indeks >= 0){
            ++brojačLav;
            //Prelazimo na poziciju posle poslednje reči "lav"
            indeks += Lav.length();
            indeks = tekst.indexOf(Lav,indeks);
        }
        
        //Pretraga unazad za reč "je"
        //Pronalaženje poslednje reči "je"
        indeks = tekst.lastIndexOf(Je);
        while(indeks >= 0){
            ++brojačJe;
            //Prelazimo na poziciju pre poslednje reči "je"
            indeks -= Je.length();
            indeks = tekst.lastIndexOf(Je,indeks);
        }
                
        System.out.println("Broj reči \"lav\" je: " + brojačLav);
        System.out.println("Broj reči \"je\" je: " + brojačJe);
        System.out.println("Uočite razliku.");

    }
    
}
