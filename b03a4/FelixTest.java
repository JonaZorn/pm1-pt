import java.util.Scanner;

public class FelixTest {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println(
      "Durchschnitts Rechner\n" +
      "Beenden des Programms mit Strg+d\n" + 
      "und Sie bekommen den Durschnitt der eingegeben Zahlen ein\n" +
      "oder geben Sie einfach summe ein!"
    );
    System.out.println("\u001B[32mBitte verwenden Sie ',' statt '.' für Kommazahlen.\u001B[0m"); // Konsolenausgabe in grün für den Hinweise das , statt . verwendet werden soll
    System.out.println("Geben Sie Gleitkommazahlen ein: ");
    double ergebnis = Felix.durchschnitt(sc);
    System.out.println("Der Durchschnitti ist: " + ergebnis);
    sc.close();
	}
}