import java.util.Scanner;
public class Eingabe {
    public static int filter(java.util.Scanner sc, java.io.PrintStream ps, 
                            String start, String stop, String skip){
        int i = 0;
        String wort = "";
        while (sc.hasNext()) {
            wort = sc.next();
            if (wort.equals(start)) {
                while (sc.hasNext(); && !wort.equals(stop)) {
                }
            } else if (wort.equals(skip)) {
                sc.nextLine();
            } else {
                ps.print(wort + " ");
                i++;
            }
        }
        ps.println();
        return i; 
    }
}