package kockicezajamb;

import java.util.*;
public class KockiceZaJamb {

    public static void main(String[] args) {
        //Deklaracija kockica
        int kockica1, kockica2, kockica3, kockica4, kockica5;
        
        //Bacanje kockica
        kockica1 = (int)(Math.random()*6)+1;
        kockica2 = (int)(Math.random()*6)+1;
        kockica3 = (int)(Math.random()*6)+1;
        kockica4 = (int)(Math.random()*6)+1;
        kockica5 = (int)(Math.random()*6)+1;
        
        //Ispisivanje kockica
        System.out.println("BACANJE KOCKICA : ");
        System.out.println("-----" + "  -----" + "  -----" + "  -----" + "  -----");
        System.out.println("| "+kockica1 +" |  "+ "| " +kockica2+ " |  "  + "| " +kockica3+ " |  " + "| " +kockica4+ " |  " + "| " +kockica5+ " |  ");
        System.out.println("-----" + "  -----" + "  -----" + "  -----" + "  -----");
        
        //Kreiranje ArrayLista
        List<String> lista = new LinkedList<>();
        
        //Dodavanje elemenata u listu
        lista.add(String.valueOf(kockica1));
        lista.add(String.valueOf(kockica2));
        lista.add(String.valueOf(kockica3));
        lista.add(String.valueOf(kockica4));
        lista.add(String.valueOf(kockica5));
        
        System.out.println();
        if(findDuplicates(lista).isEmpty()) {
            System.out.println("BROJEVI SE NE PONAVLJAJU!");
        } 
        else {
            System.out.println("BROJEVI KOJI SE PONAVLJAJU SU : "+ findDuplicates(lista));
        }
    }
        public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

        final Set<String> set = new HashSet<>();
        final Set<String> set1 = new HashSet<>();

        for (String yourInt : listContainingDuplicates) {
            if (!set1.add(yourInt)) {
                set.add(yourInt);
        }
        }
        return set;
}
}
