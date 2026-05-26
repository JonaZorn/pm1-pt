import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MessdatenTest {
    public static void main(String[] args) throws FileNotFoundException { 
        Scanner sc = new Scanner(System.in);
        System.out.println(Messdaten.durchschnitt(sc, "temperatur"));
    }
}
