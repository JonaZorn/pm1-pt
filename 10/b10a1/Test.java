public class Test {
    public static void main(String[] args) {
        Stromvertrag v1 = new Stromvertrag("Anna Muster", 1, 0);
        System.out.println("Nummer: " + v1.nummer());
        System.out.println("Anzahl: " + v1.anzahl());

        int kosten = v1.rechnung(4, 300);
        System.out.println("Kosten nach 3 Monaten, 300 kWh: " + kosten + " Cent");

        StromvertragOeko v2 = new StromvertragOeko("Ben Beispiel", 2, 0);
        System.out.println("Oeko-Nummer: " + v2.nummer());       // von Stromvertrag geerbt (globaler Zaehler)
        System.out.println("Oeko-Anzahl: " + v2.anzahl());       // eigener Oeko-Zaehler

        int kostenOeko = v2.rechnung(5, 300);
        System.out.println("Oeko-Kosten nach 3 Monaten, 300 kWh: " + kostenOeko + " Cent");
    }
}