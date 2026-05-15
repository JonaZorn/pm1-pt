import java.util.Scanner;

public class Eingabe {
  public static int zaehlen(String s, Scanner scan){
    int counter = 0;
    String[] string_array = s.split(" "); 
    System.out.println("Welches Wort wird aus dem Satz gesucht? " + s);
    String input_string = scan.next(); 
    System.out.println(s);
    for(int i = 0 ; i < (string_array.length-1); i++){ 
      if(string_array[i].equals(input_string)){
        counter++;
      }
    }
    return counter;
  }

}