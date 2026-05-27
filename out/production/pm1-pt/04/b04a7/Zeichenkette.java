import java.util.Scanner;
public class Zeichenkette{
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




     public static void eingabe(java.util.Scanner sc, java.io.PrintStream ps) {
        String s = sc.nextLine();
        ps.println("In " + s + " sind genau " + anzahlZiffern(s) + " Zahlen enthalten.");
        ps.println((istName(s) == 1) ? "ist richtig!":"ist falsch!");
        ps.println(vokaleGross(s));



    }
}