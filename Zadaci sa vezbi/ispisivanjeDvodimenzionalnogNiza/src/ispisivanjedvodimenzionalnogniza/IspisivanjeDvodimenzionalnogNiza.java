/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispisivanjedvodimenzionalnogniza;

/**
 *
 * @author Ivke
 */
import java.util.*;
public class IspisivanjeDvodimenzionalnogNiza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] Matrica = new int[10][5];
        
        for(int i = 0; i < Matrica.length; i++){
            for(int j = 0; j < Matrica[i].length; j++){
                Matrica[i][j] = i;
                System.out.print(" "+Matrica[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
