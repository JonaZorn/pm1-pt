public class Test {
    public static void main(String[] args) {
        Punkt2D mitte = new Punkt2D(0, 0);
        RechteckXYPerMitteLaengen r1 = new RechteckXYPerMitteLaengen(mitte, 4, 2);

        System.out.println("Rechteck: " + r1);
        System.out.println("Mitte: " + r1.mitte());
        System.out.println("Breite: " + r1.breite());
        System.out.println("Tiefe: " + r1.tiefe());
        System.out.println("Durchmesser: " + r1.durchmesser());
        System.out.println("Umfang: " + r1.umfang());
        System.out.println("Flaeche: " + r1.flaeche());

        Punkt2D lup = r1.ecke(false, false);
        Punkt2D rop = r1.ecke(true, true);
        System.out.println("Linke untere Ecke: " + lup);
        System.out.println("Rechte obere Ecke: " + rop);

        Punkt2D innen = new Punkt2D(1, 0.5);
        Punkt2D aussen = new Punkt2D(5, 5);
        System.out.println("Punkt (1, 0.5) enthalten? " + r1.istEnthalten(innen));
        System.out.println("Punkt (5, 5) enthalten? " + r1.istEnthalten(aussen));

        // Kopie-Konstruktor testen
        RechteckXYPerMitteLaengen r2 = new RechteckXYPerMitteLaengen(r1);
        System.out.println("Kopie gleich Original? " + r1.equals(r2));

        // verschiebe testen
        r1.verschiebe(1, 1);
        System.out.println("Nach Verschiebung um (1,1): " + r1);
        System.out.println("Kopie noch gleich Original? " + r1.equals(r2));

        // Ungueltige Argumente testen
        try {
            RechteckXYPerMitteLaengen r3 = new RechteckXYPerMitteLaengen(mitte, -1, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erwartete Exception bei negativer Breite: " + e.getMessage());
        }
    }
}