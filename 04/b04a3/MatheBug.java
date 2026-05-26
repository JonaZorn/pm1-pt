import java.util.Scanner;

public class MatheBug {
  public static int min(int a, int b, int c, int d) {
    int min = a;
    if (b < min) {
      min = b;
    }
    if (c < min) {
      min = c;
    }
    if (d < min) {
      min = d;
    }
    return min;
  }

  public static double mean(int a, int b, int c, int d) {
    return (a + b + c + d) / 4.0;
  }

  public static int nextToMean(int a, int b, int c, int d) {
    double mean = mean(a, b, c, d);
    int ergebnis = a;
    double zw = Math.abs(a -mean);
    if (Math.abs(b - mean) < zw) {
      ergebnis = b;
      zw = Math.abs(b - mean);
    }
    if (Math.abs(c - mean) < zw) {
    ergebnis = c;
    zw = Math.abs(c - mean);
    }
    if (Math.abs(d - mean) < zw) {
      ergebnis = d;
    }
    return ergebnis;
  }

  public static void eingabe(java.util.Scanner sc, java.io.PrintStream ps) {
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

      ps.println("Eingabe: " + a + " " + b + " " + c + " " + d);
      ps.println("Minimum: " + min(a, d, c, b));
      ps.println("Mittelwert: " + String.format("%.2f", mean(a, b, c, d)));
      ps.println("am naechsten am Mittelwert: " + nextToMean(a, b, c, d));

  }
}