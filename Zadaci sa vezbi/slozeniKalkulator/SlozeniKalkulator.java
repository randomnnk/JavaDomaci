package slozenikalkulator;

class SlozeniKalkulator  {
     
     void ipisiBroj(int a){
         for(int i=1; i <= 50; i++){
             System.out.println(a);
         }
     }
     
     void ispisiBrojeveOd1Do100 (){
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }
     }

     static int suma (int n){
         int suma = 0;
         for(int i=1; i<=n; i++) suma = suma + i;
         return suma;
     }
     
     static double stepen(double x, int n){
         double st = 1;
         for(int i=1; i<=n; i++)st = st*x;
         return st;
     }
     
     static int minStepenDva(int broj){
         int rezultat = 1; 
         while(rezultat < broj) rezultat = rezultat*2;
         return rezultat;
     }
     
     static void deljenjeSaDva(int broj){
         while(broj>1){
             broj=broj/2;
             System.out.println(broj);
         }
     }    

   
}
