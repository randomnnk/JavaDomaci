package geometrija;

public class TestKvadrat {
    public static void main(String[] args){
        
        Kvadrat k = new Kvadrat(5.0);
       
        System.out.println("Obim kvadrata za stranicu a = "+k.getStranica()+" iznosi : "+k.obim());
        System.out.println("Povrsina kvadrata za stranicu a = "+k.getStranica()+" iznosi : "+k.povrsina());
    }
}
