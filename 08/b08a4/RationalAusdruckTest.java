public class RationalAusdruckTest {
    public static void main(String[] args) {

        // --- auswertung: normale Fälle ---
        System.out.println("-- auswertung --");
        Rational a = Rational.parse("8/12");
        Rational b = Rational.parse("36/27");
        System.out.println(a + " + " + b + " = " + RationalAusdruck.auswertung(a, '+', b)); // 2/1

        Rational c = Rational.parse("14/4");
        Rational d = Rational.parse("24/15");
        System.out.println(c + " - " + d + " = " + RationalAusdruck.auswertung(c, '-', d)); // 19/10

        Rational e = Rational.parse("18/21");
        Rational f = Rational.parse("-35/8");
        System.out.println(e + " * " + f + " = " + RationalAusdruck.auswertung(e, '*', f)); // -15/4

        Rational g = Rational.parse("1/2");
        Rational h = Rational.parse("3/4");
        System.out.println(g + " / " + h + " = " + RationalAusdruck.auswertung(g, '/', h)); // 2/3

        // --- auswertung: IllegalArgumentException ---
        System.out.println("\n-- auswertung: IllegalArgumentException --");
        try {
            RationalAusdruck.auswertung(a, '?', b);
        } catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException: " + ex.getMessage());
        }

        // --- auswertung: ArithmeticException bei Division durch 0 ---
        System.out.println("\n-- auswertung: ArithmeticException --");
        try {
            Rational null0 = new Rational(0);
            RationalAusdruck.auswertung(a, '/', null0);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        }

        // --- next ---
        System.out.println("\n-- next --");
        java.util.Scanner sc1 = new java.util.Scanner("8/12 + 36/27");
        System.out.println("= " + RationalAusdruck.next(sc1)); // 2/1

        java.util.Scanner sc2 = new java.util.Scanner("18/21 * -35/8");
        System.out.println("= " + RationalAusdruck.next(sc2)); // -15/4

        java.util.Scanner sc3 = new java.util.Scanner("14/4 - 24/15");
        System.out.println("= " + RationalAusdruck.next(sc3)); // 19/10

        // --- next: InputMismatchException ---
        System.out.println("\n-- next: InputMismatchException --");
        try {
            java.util.Scanner sc4 = new java.util.Scanner("abc + 1/2");
            RationalAusdruck.next(sc4);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("InputMismatchException: " + ex.getMessage());
        }

        try {
            java.util.Scanner sc5 = new java.util.Scanner("1/2 ?? 3/4");
            RationalAusdruck.next(sc5);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("InputMismatchException: " + ex.getMessage());
        }

        // --- next: ArithmeticException bei Division durch 0 ---
        System.out.println("\n-- next: ArithmeticException --");
        try {
            java.util.Scanner sc6 = new java.util.Scanner("1/2 / 0/1");
            RationalAusdruck.next(sc6);
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: " + ex.getMessage());
        }
    }
}