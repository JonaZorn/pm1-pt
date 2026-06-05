public class RechteckXYPerEckeTest {
    public static void main(String[] args) {
        RechteckXYPerEcke r1 = new RechteckXYPerEcke(1, 5, 2, 6);
        System.out.println(r1);           // [(1.0,2.0),(5.0,6.0)]
        System.out.println(r1.breite());  // 4.0
        System.out.println(r1.tiefe());   // 4.0
        System.out.println(r1.flaeche()); // 16.0
        System.out.println(r1.umfang());  // 16.0
        System.out.println(r1.durchmesser()); // 5.656...
        System.out.println(r1.mitte());   // (3.0,4.0)
        System.out.println(r1.ecke(0));   // linke untere
        System.out.println(r1.ecke(1));   // rechte untere
        System.out.println(r1.ecke(2));   // rechte obere
        System.out.println(r1.ecke(3));   // linke obere

        r1.verschiebe(2, 3);
        System.out.println(r1);           // verschoben
    }
}