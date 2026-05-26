import java.util.Scanner;

public class Messdaten {
    public static double durchschnitt(Scanner sc, String g){
        double f = 0.0;
        int i = 0;
        String datensatz = "";
        double max = -Double.MAX_VALUE;
        while(sc.hasNext()){
            int jahr = sc.nextInt();
            int monat = sc.nextInt();
            int tag = sc.nextInt();
            String grosse = sc.next();
            int dobble = sc.nextDouble();
            if(g.equals(grosse)){
                f += dobble;
                if(grosse > max){
                    max = dobble;
                    datensatz = jahr + "/" + monat + "/" + tag;
                }
            } i++;
        }
        System.out.println(datensatz);
        return f / i;
    }
}