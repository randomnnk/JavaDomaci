package kalkulator;

/*
 * @author Ivke
 */
import java.util.*;
public class Kalkulator {
    
    public int saberi (int broj1, int broj2)
    {
        return broj1 + broj2;
    }
    
    public int oduzmi (int broj1, int broj2)
    {
        return broj1 - broj2;
    }

    public int pomnozi (int broj1, int broj2)
    {
        return broj1 * broj2;
    }
    
    public int podeli (int broj1, int broj2)
    {
        return broj1 / broj2;
    }
    
    public static void main(String[] args) {
       
        Kalkulator kalk = new Kalkulator();
        
        Scanner unesi = new Scanner(System.in);
        
        System.out.print("Unesi prvi broj: ");
        int broj1 = unesi.nextInt();
        
        System.out.print("Unesi drugi broj: ");
        int broj2 = unesi.nextInt();
        
        System.out.print("Unesi zeljenu operaciju (+, -, x, /) :  ");
        String operacija = unesi.next();
        
        if (operacija.equals("+")) 
            System.out.println(kalk.saberi(broj1, broj2));
        
        else if (operacija.equals("-"))
            System.out.println(kalk.oduzmi(broj1, broj2));
        
        else if (operacija.equals("x"))
            System.out.println(kalk.pomnozi(broj1, broj2));
        
        else if (operacija.equals("/"))
            System.out.println(kalk.podeli(broj1, broj2));
        
        else 
            System.out.println("Operacija nije validna! Pokusajte ponovo!");
    }
}




