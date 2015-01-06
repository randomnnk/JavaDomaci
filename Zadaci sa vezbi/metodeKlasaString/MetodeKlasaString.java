/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodeklasastring;

/**
 *
 * @author Ivke
 */
public class MetodeKlasaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // <editor-fold desc = "Nadovezivannje stringova">
        String S1 = "Visoka";
        String S2 = "tehnicka skola";
        System.out.println(S1 + " " + S2 );
        System.out.println("\n");
        // </editor-fold>
        
       // <editor-fold desc = "Poredjenje stringova">
        String prviString = "Kragujevac";
        String drugiString = "KRAGUJEVAC";
        
        if(prviString.equals(drugiString)){
            System.out.print("Stringovi su jednaki!");
        }
        else{
            System.out.println("Stringovi nisu jednaki!");
        }
        System.out.println("\n");
        // </editor-fold>
        
        // <editor-fold desc = "Mala i velika slova">
        String S3 = S1 + " " + S2 + " " + prviString;
        System.out.println("String S3 izgleda ovako: " + S3);        
        System.out.println("String S3 sada izgleda ovako: " + S3.toUpperCase());
        System.out.println("A može da izgleda i ovako: " + S3.toLowerCase());
        System.out.println("\n");
        // </editor-fold>
        
        // <editor-fold desc="Dužina i karaktera na određenom mestu">
        System.out.println("Naš string: " + S3);
        System.out.println("je dužine: " + S3.length() + " karaktera.");
        System.out.println("Karakter na mestu 3 je: " + S3.charAt(2));
        System.out.println("Prvo pojavljivanje slova a je na mestu: " + S3.indexOf("a"));
        System.out.println("\n");
        // </editor-fold>
        
        // <editor-fold desc="Podniz stringova">
        System.out.println("Naš substring od pozicije 7: " + S3.substring(7));
        System.out.println("Naš substring između pozicije 7 i 15: " + S3.substring(7, 15));
        System.out.println("\n");
        // </editor-fold>
 

    }
    
}
