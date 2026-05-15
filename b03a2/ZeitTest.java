public class ZeitTest {
    public static void main(String[] args) {
        int testWert = 6066;
     
        System.out.println(Zeit.tage(testWert));
        System.out.println(Zeit.stunden(testWert));
        System.out.println(Zeit.minuten(testWert));
        
        System.out.println(Zeit.dauer(testWert));
    }
}