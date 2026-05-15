import java.util.Scanner;

public class EingabeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
        "Durchschnitts Rechner\n" +
        "Beenden das Programms mit Strg+d und dann Enter\n"
        );
        
        System.out.println("Bitte verwenden Sie ',' statt '.'."); // Konsolenausgabe in grün für den Hinweise das , statt . verwendet werden soll
        System.out.println("Geben Sie Gleitkommazahlen ein: ");
        double ergebnis = Felix.durchschnitt(sc);
        System.out.println("Durchschnitt: " + ergebnis);
        sc.close();
    }
}