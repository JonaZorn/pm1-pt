import java.util.Scanner;
public class EingabeTest {
    public static void main(String[] args) {
        String text =         "/*\n" +
                              " * Programm: gibt \"Hi!\" aus\n" +
                              " */\n" +
                              " Hi {\n" +
                              "    public static void main(String[] args) {\n" +
                              "        // Ausgabe der Nachricht\n" +
                              "        System.out.println(\"Hi!\");\n" +
                              "    }\n" +
                              "}";
        Scanner testScanner = new Scanner(text);
        System.out.println("Das ist Ihr Text:");
        int ergebnis = Eingabe.filter(testScanner, System.out, "/*", "*/", "//"); 
        
        System.out.println("---AUSGABE ---");
        System.out.println("Das sind insgesamt " + ergebnis + " Wörter.");
        
        testScanner.close();
    }
    
}
