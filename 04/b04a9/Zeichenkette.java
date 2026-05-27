 /**
* Die Methode "eingabe" liest eine Textzeile ein und gibt die Eingabe an die verschiedenen  
* Methoden weiter. Ich habe bewusst nur ein "s" gewählt, um die Überprüfung zu vereinfachen und die Eingabe zu erleichtern.
*
* @param sc Der Scanner zum Einlesen der Eingaben aus der Konsole.
* @param ps Der PrintStream für die Textausgabe auf der Konsole.
*/
import java.io.PrintStream;
import java.util.Scanner;
public class Zeichenkette{
    
    
    /**
    * Die Methode "anzahlZiffern" bestimmt die Anzahl aller Ziffern aus einer Eingabe 
    * mit gemischten Buchstaben und Zahlen.
    * @param s Die Eingabe-Zeichenkette, die auf enthaltene Ziffern überprüft wird.
    * @return Liefert die Gesamtzahl der Ziffern aus der Eingabe s als ganzzahligen Wert.
    */
    public static int anzahlZiffern(String s){
        int l = 0;
        int Zahlen = 0;
        for (l = 0; l < s.length(); l++) {
            if(Character.isDigit(s.charAt(l))) {
                Zahlen = Zahlen + 1;
            }
        }
        return Zahlen;
    }

    /**
    * Die Methode "istName" bestimmt, ob die Eingabe gültig ist. 
    * Sie prüft, ob enthaltene Bindestriche an den erlaubten Stellen stehen,
    * also weger am Anfang noch am Ende
    * und ob unzulässige Zeichen oder Leerzeichen enthalten sind.
    *
    * @param s Die Eingabe-Zeichenkette, die auf ihre Gültigkeit als Name geprüft wird.
    * @return Liefert 1, wenn der Name gültig ist, oder 0, wenn die Eingabe fehlerhaft ist.
    */
    public static int istName(String s){
        int l = 0;
        int Zahlen = 0;
        for (l = 0; l < s.length(); l++) {
            char z = s.charAt(l);
            if (z == '-' && (l == 0 || l == s.length() - 1)) {
                return 0;
            }
            if (!Character.isLetter(z) && z != '-') {
                return 0;
            }
        }
        return Zahlen;
    }

    /**
    * die methode vokaleGross Wandelt alle Vokale aus der Eingabe in Großbuchstaben um
    * und alle Konsonanten in Kleinbuchstaben.
    *
    * @param s nimmt in diesem Fall Text mit leerzeichen an.
    * @return giebt inhaltlich die Eingabe wieder nur mit gross geschriebenen Vokalen und kleinen Konsonanten.
    */
    public static String vokaleGross(String s){
        String umstellung = "";
        for (int l = 0; l < s.length(); l++) {
            char z = s.charAt(l);
            if (z == 'a' | z == 'e' | z == 'i' | z == 'o' | z == 'u' |
                z == 'A' | z == 'E' | z == 'I' | z == 'O' | z == 'U') {
                umstellung = umstellung + Character.toUpperCase(z);
            } else {
                umstellung = umstellung + Character.toLowerCase(z);
            }
        }
        return umstellung;
    }

    /**
    * Die Methode "eingabe" liest eine Textzeile ein und gibt die Eingabe an die verschiedenen  
    * Methoden weiter. Ich habe bewusst nur ein "s" gewählt, um die Überprüfung zu vereinfachen und die Eingabe zu erleichtern.
    *
    * @param sc Der Scanner zum Einlesen der Eingaben aus der Konsole.
    * @param ps Der PrintStream für die Textausgabe auf der Konsole.
    */
    public static void eingabe(java.util.Scanner sc, java.io.PrintStream ps) {
        String s = sc.nextLine();
        ps.println("In " + s + " sind genau " + anzahlZiffern(s) + " Zahlen enthalten.");
        ps.println((istName(s) == 1) ? "ist richtig!":"ist falsch!");
        ps.println(vokaleGross(s));



    }
}