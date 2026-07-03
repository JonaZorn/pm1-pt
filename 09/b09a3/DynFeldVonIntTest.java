public class DynFeldVonIntTest {
    public static void main(String[] args) {
        
        DynFeldVonInt feld = new DynFeldVonInt(3);
        feld.set(0, 2);
        feld.set(1, 7);
        feld.set(2, -1);
        System.out.println(feld); // [3,7,-1]

        feld.insert(1, 2);
        System.out.println(feld); // [3,0,0,7,-1]

        feld.set(2, 5);
        feld.set(1, -3);
        System.out.println(feld); // [3,-3,5,7,-1]

        feld.remove(2, 3);
        System.out.println(feld); // [3,-3]

        try {
            feld.remove(1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException korrekt geworfen");
        }
    }
}