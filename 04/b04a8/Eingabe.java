import java.util.Scanner;
public class Eingabe {
    public static int filter(java.util.Scanner sc, java.io.PrintStream ps, String start, String stop, String skip){
        int i = 0;
        String wort = "";
        while (sc.hasNext()) {
            wort = sc.next();
            if (wort.equals(start)) {
                while (!wort.equals(stop)) {
                    wort = sc.next();
                }
            } else if (wort.equals(skip)) {
                wort = sc.nextLine();
            } else {
                ps.print(wort + " ");
                i++;
            }
        }
        ps.println();
        return i; 
    }
}