public class DatumTest {
    public static void main(String[] args) {

        // Objekte erstellen
        Datum d1 = new Datum();
        Datum d2 = new Datum(2026);
        Datum d3 = new Datum(2026, 3);
        Datum d4 = new Datum(2026, 3, 8);
        Datum d5 = new Datum(d4); // Kopie

        // Ausgabe Standard-Format
        System.out.println(d4.toString()); // 2026-03-08

        // Reihenfolge ändern
        Datum.setFormatRF("tmj");
        System.out.println(d4.toString()); // 08-03-2026

        // Trennzeichen ändern
        Datum.setFormatTZ('/');
        System.out.println(d4.toString()); // 08/03/2026

        // Vergleiche
        System.out.println(d4.equals(d5));       // true
        System.out.println(d2.istFrueher(d4));   // true
    }
}