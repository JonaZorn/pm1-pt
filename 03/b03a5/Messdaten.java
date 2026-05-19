import java.util.Scanner;

public class Messdaten {
    public static double durchschnitt(Scanner sc, String g){
        double temp = 0.0;
        int counter = 0;
        String datensatz = "";
        double max = -Double.MAX_VALUE;
        while(sc.hasNext()){
            int jahr = sc.nextInt();
            int monat = sc.nextInt();
            int tag = sc.nextInt();
            if(sc.next().equals(g)){
                double tmp_temp = sc.nextDouble();
                temp += tmp_temp;
                ++counter;
                if(tmp_temp > max){
                    max = tmp_temp;
                    datensatz = "max. " + g + " (" + tmp_temp + ")" + " am " + jahr + "/" + monat + "/" + tag;
                }
            } else {
                sc.nextDouble();
            }
        }
        System.out.println(datensatz);
        return temp / counter;
    }
}