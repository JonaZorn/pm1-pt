import java.util.Scanner;

public class Felix {
  public static double durchschnitt(Scanner scan){
    double summe = 0;
    int anzahl = 0;

    while(scan.hasNextDouble()){ // Solange scan eine Eingabe vom Typ double bekommt läuft die Eingabe weiter
      double zahl = scan.nextDouble();
      summe += zahl;
      anzahl++;  
    }
    if(anzahl == 0){
      return 0;
    }
    return summe / anzahl;
  }

}