package fakultet;

public class TestStudent {
    
    public static void main(String[] args){
        
        Student st = new Student();
        
        st.setIme("Laza");
        st.setPrezime("Lazic");
        st.setBrojIndeksa(186);
        
        System.out.println("Podaci o studentu su :");
        System.out.println("Ime : "+st.getIme());
        System.out.println("Prezime : "+st.getPrezime());
        System.out.println("Broj indeksa : "+st.getBrojIndeksa());
    }
}
