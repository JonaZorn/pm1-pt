public class RationalTest {
    public static void main(String[] args) {

        // --- Konstruktoren ---
        System.out.println("-- Konstruktoren --");
        Rational r1 = new Rational();
        Rational r2 = new Rational(3);
        Rational r3 = new Rational(2, 4);
        Rational r4 = new Rational(-2, -4);
        Rational r5 = new Rational(2, -4);
        Rational r6 = new Rational(r3);

        System.out.println("r1 = " + r1);        // 0/1
        System.out.println("r2 = " + r2);        // 3/1
        System.out.println("r3 = " + r3);        // 1/2
        System.out.println("r4 = " + r4);        // 1/2
        System.out.println("r5 = " + r5);        // -1/2
        System.out.println("r6 = " + r6);        // 1/2

        // --- parse ---
        System.out.println("\n-- parse --");
        System.out.println(Rational.parse("-2/3"));      // -2/3
        System.out.println(Rational.parse("24/-8"));     // -3/1
        System.out.println(Rational.parse("-20/-20"));   // 1/1
        System.out.println(Rational.parse("  6 / 4 ")); // 3/2

        // --- parse: IllegalArgumentException ---
        System.out.println("\n-- parse: IllegalArgumentException --");
        try {
            Rational.parse("abc");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
        try {
            Rational.parse("1-2");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }

        // --- parse: ArithmeticException bei Nenner 0 ---
        System.out.println("\n-- parse: ArithmeticException --");
        try {
            Rational.parse("5/0");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // --- parse: NullPointerException ---
        System.out.println("\n-- parse: NullPointerException --");
        try {
            Rational.parse(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        // --- Konstruktor: ArithmeticException bei Nenner 0 ---
        System.out.println("\n-- Konstruktor: ArithmeticException --");
        try {
            Rational r7 = new Rational(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}