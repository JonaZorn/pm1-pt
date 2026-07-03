public class FeldRationalTest {
    public static void main(String[] args) {
        
        // istHomogen Tests
        FeldRational.Rational[] f6 = {new FeldRational.Rational(3,4), new FeldRational.Rational(3,4), new FeldRational.Rational(3,4)};
        System.out.println(FeldRational.istHomogen(f6)); // true
 
        FeldRational.Rational[] f5 = {new FeldRational.Rational(1,2), new FeldRational.Rational(3,4), new FeldRational.Rational(5,6)};
        System.out.println(FeldRational.istSortiert(f5));

        FeldRational.Rational[] f3 = {new FeldRational.Rational(3,4), new FeldRational.Rational(4,5), new FeldRational.Rational(7,9)};
        System.out.println(FeldRational.maxPos(f3));

        FeldRational.Rational[] f4 = {new FeldRational.Rational(1,2), new FeldRational.Rational(3,4), new FeldRational.Rational(5,6)};
        System.out.println(FeldRational.maxElement(f4));

        FeldRational.Rational[] f1 = {new FeldRational.Rational(3,4), new FeldRational.Rational(1,2), new FeldRational.Rational(8,7)};
        FeldRational.Rational[] f2 = {new FeldRational.Rational(2,3), new FeldRational.Rational(4,9), new FeldRational.Rational(-3,2)};

        FeldRational.Rational[] ergebnis = FeldRational.max(f1, f2);
        for (FeldRational.Rational r : ergebnis) {
            System.out.println(r);
        }
        try {
            FeldRational.istHomogen(null);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException korrekt geworfen");
        }
    }
}