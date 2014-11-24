/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srednjavernostunapredzadatogniza;

/**
 *
 * @author Ivke
 */
public class SrednjaVernostUnapredZadatogNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Srednja vrednost niza je : ");
        System.out.println(prosek(3,5,8,19,-5,45,-25,16));
        
    }
    
    public static double prosek(double ... brojevi){
        
        double zbir = 0;
        int brojac = 0;
        for(int i = 0; i < brojevi.length; i++){
            zbir = zbir + brojevi[i];
            brojac++;
        }
        return zbir/brojac;
    }
    
}
