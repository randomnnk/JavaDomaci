package slozenikalkulator2;

class SlozeniKalkulator2 {
    
    void ispisiBrojeveOd55Do0(){
        for(int i = 55; i >= 0; i--){
            System.out.println(i);
        }
    }
    
    static int faktorijel(int n){
        int f=1;
        for(int i = 1; i <= n; i++) f = f*i;
        return f;
    }
    
    static int aPlusBNaN(int a,int b,int n){
        int rezultat = 1;
        for(int i = 1; i <= n; i++) rezultat = rezultat*(a+b);
        return rezultat;
    }     
}
