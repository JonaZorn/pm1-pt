/*Die zweite Klasse "HelloWithCommunication" beginnt hier. */
public class HelloWithCommunicationZusammen{
public static void main(String[] args){
  System.out.println(Communication.greeting(" Welt"));
/* */
  }
  class Communication {  

/*Die Klassenmethode "String greeting(String name)" gibt das Argument ""name".
Name dient hierbei als Variable, jelche aus einer beliebigen Zeichenkette bestehen kann.*/
  public static String greeting(String name){ 
    return "Hallo" + name + "! ";//return giebt Zeichenfolge "Hallo" und Argument "name" und "!" zurueck an public class
    }//Ende der Klassenmethode
  }//Ende der Hilfsklasse
} //Ende der public class


