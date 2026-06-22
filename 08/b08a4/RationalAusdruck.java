import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;

public class RationalAusdruckTest{

    public static Rational auswertung(Rational a, char op, Rational b) {
        switch (op) {
            case '+': return a.add(b);
            case '-': return a.sub(b);
            case '*': return a.mul(b);
            case '/': return a.div(b); 
            default:
                throw new IllegalArgumentException("ungueltiger Wert fuer Operator: " + op);
        }
    }

    public static Rational next(Scanner sc) {
        try {
            String aStr = sc.next();   // z.B. "8/12"
            String opStr = sc.next();  // z.B. "+"
            String bStr = sc.next();   // z.B. "36/27"

            if (opStr.length() != 1) {
                throw new InputMismatchException("ungueltiger Operator: " + opStr);
            }

            Rational a = Rational.parse(aStr);
            Rational b = Rational.parse(bStr);
            char op = opStr.charAt(0);

            return auswertung(a, op, b);

        } catch (IllegalArgumentException e) {
            throw new InputMismatchException("ungueltiges Format");
        }
    }

    public static void dialog() throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                try {
                    Rational ergebnis = next(sc);
                    System.out.println("= " + ergebnis);
                } catch (ArithmeticException | InputMismatchException e) {
                    throw new IOException(e.getMessage());
                }
            }
            sc.close();
        } catch (IOException e) {
            throw e;
        }
    }

    public static void main(String[] args) throws IOException {
        dialog();
    }
}