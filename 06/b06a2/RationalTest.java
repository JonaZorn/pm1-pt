public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(28, 35);  // 4/5
        Rational r2 = new Rational(60, -135); // -4/9
        Rational r3 = new Rational(3);        // 3/1
        Rational r4 = new Rational();         // 0/1

        System.out.println(r1); // 4/5
        System.out.println(r2); // -4/9
        System.out.println(r3); // 3/1
        System.out.println(r4); // 0/1

        // Vergleiche
        System.out.println(r1.equals(r2));    // false
        System.out.println(r2.istKleiner(r1)); // true

        // Rechnen
        System.out.println(r1.add(r2));  // 4/5 + -4/9
        System.out.println(r1.sub(r2));  // 4/5 - -4/9
        System.out.println(r1.mul(r2));  // 4/5 * -4/9
        System.out.println(r1.div(r2));  // 4/5 / -4/9

        // abs und rez
        System.out.println(r2.abs());  // 4/9
        System.out.println(r2.rez());  // -9/4
    }
}