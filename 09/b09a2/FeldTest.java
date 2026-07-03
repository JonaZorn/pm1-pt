public class FeldTest {
    public static void main(String[] args) {
        
        // umkehren
        int[] f1 = {3, 4, 8, 1};
        int[] ergebnis = Feld.umkehren(f1);
        for (int x : ergebnis) {
            System.out.print(x + " "); // 5 8 1 3
        }
        System.out.println();

        // umkehrenInPlace
        int[] f2 = {9, 1, 3, 5};
        Feld.umkehrenInPlace(f2);
        for (int x : f2) {
            System.out.print(x + " "); // 5 8 1 3
        }
        System.out.println();

        // null Test
        try {
            Feld.umkehren(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException korrekt geworfen");
        }
    }
}