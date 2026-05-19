import java.util.Scanner;

public class Eingabe {
    public double String durchschnitt(Scanner sc) {
        double s = 0.0;
        int i = 0;
        
        while (sc.hasNextDouble()) { 
            double z = sc.nextDouble();
            s += z; 
            i++;
        }
        if(i == 0){
            return "Es sind keine Zahlen angegeben.";
        }
        return e = s / i;
    }
}