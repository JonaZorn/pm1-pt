public class DatumTest{
    public static boolean test(){
            boolean resultat = true;
            if( Datum.istSchaltjahr(2001) != 0){
                System.out.println("Fehler");
                resultat = false;
            }
            
            if( Datum.istSchaltjahr(2000) != 1){
                System.out.println("Fehler");
                resultat = false;
            }
            return resultat;      
        }    
            
    public static void main(String[] args) {
        if (test()){
            System.out.println("Schaltjahr-Test");
            System.out.println("Datum.java funktioniert!");
        }
    }
}