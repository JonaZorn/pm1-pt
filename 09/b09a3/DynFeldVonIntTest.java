public class DynFeldVonIntTest {
    public static void main(String[] args) {
        
        DynFeldVonInt feld = new DynFeldVonInt(3);
        feld.set(0, 3);
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
}public class DynFeldVonIntTest {
    public static void main(String[] args) {

        DynFeldVonInt feld = new DynFeldVonInt(3);
        feld.set(0, 3);
        feld.set(1, 7);
        feld.set(2, -1);
        pruefe(feld, new int[]{3, 7, -1}, "Initialisierung");

        feld.insert(1, 2);
        pruefe(feld, new int[]{3, 0, 0, 7, -1}, "insert(1,2)");

        feld.set(2, 5);
        feld.set(1, -3);
        pruefe(feld, new int[]{3, -3, 5, 7, -1}, "set-Aufrufe");

        feld.remove(2, 3);
        pruefe(feld, new int[]{3, -3}, "remove(2,3)");

        try {
            feld.remove(1, 2);
            System.out.println("FEHLER: keine Exception geworfen");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException korrekt geworfen");
        }
    }

    private static void pruefe(DynFeldVonInt feld, int[] erwarteteWerte, String testName){
        DynFeldVonInt erwartet = new DynFeldVonInt(erwarteteWerte.length);
        for (int i = 0; i < erwarteteWerte.length; i++){
            erwartet.set(i, erwarteteWerte[i]);
        }

        if (feld.equals(erwartet)) {
            System.out.println(testName + ": OK " + feld);
        } else {
            System.out.println(testName + ": FEHLER! erwartet " + erwartet + " aber war " + feld);
        }
    }
}