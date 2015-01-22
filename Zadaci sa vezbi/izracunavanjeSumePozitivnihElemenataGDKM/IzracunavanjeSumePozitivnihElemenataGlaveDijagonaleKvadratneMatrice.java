/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izracunavanjesumepozitivnihelemenataglavedijagonalekvadratnematrice;

/**
 *
 * @author Ivke
 */
public class IzracunavanjeSumePozitivnihElemenataGlaveDijagonaleKvadratneMatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklaracija matrice
        int[][] Matrica = new int[][] {{ 4,  2, 0, 1}, // možete sve elemente matrice
                                       { 0, -2, 3, 8}, // uneti u jednom redu   
                                       { 1,  0, 3, 2},
                                       {-4,  5, 0, 1}};
        
        int zbir = 0; // inicijalizacija sume
        
        for(int i = 0; i < Matrica.length; i++){        // za svaki red u matrici            
            for(int j = 0; j < Matrica[i].length; j++){ // za svaku kolonu u matrici
                
                if(i == j){                         // da li je element na glavnoj dijagonali?
                    if (Matrica[i][j] > 0){         // da li je element matrice pozitivan?

                    zbir = zbir + Matrica[i][j];

                    }
                }                
            }
            System.out.println("Obrađujem red: " + (i+1));
            System.out.print("Zbir pozitivnih elemenata glavne dijagonale matrice je: ");
            System.out.println(zbir);
        }
    }
}
