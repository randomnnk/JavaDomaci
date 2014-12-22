package analizatorteksta;

public class TestAnalizatorTeksta {
    public static void main(String[] args){
        AnalizatorTeksta a = new AnalizatorTeksta("Danas je lep dan,"+" bas lep dan. Mislim da cu izaci napolje.");
        System.out.println(a.brojReci());
    }   
}
