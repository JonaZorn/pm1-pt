/*
 * Programm: gibt "Hallo Welt!" aus
 */
/*public class Hello {
  public static void{
    System.out.println("Hallo Welt!");
  }
}
*/
/*2. Art mit gruesse 

public class Hello {
  public static void gruesse(){
    System.out.println("Hallo Welt!");
  }
  public static void main(String[] args){
    gruesse();
    gruesse();
  }
}
 */



/*3. */

/*public class Hello {
  public static String gruss(){
    return"Hallo Welt!";
  }
  public static void main(String[] args){
  System.out.println(gruss());
  }
} */



/*4. Methode mit Parameter 

  /public class Hello {
  public static String gruss(String name){
    return "Hallo" + name + "!";
  }
  public static void main(String[] args){
  System.out.println(gruss("Welt"));
  }
} */




  /*5. */

/*  public class Hello {
  public static String gruss(String vorname, String name){
    return vorname + name + "!";
  }
  public static void main(String[] args){
  System.out.println(gruss("Hallo ","Welt"));
  }
} */


  /*6. 

    public class Hello {
  public static String gruss(String vorname, String name){
    return vorname + name + "!";
  }

}
*/

/* 
public class KontaktMitVar{
    public static String gruss(String name){
      String s = "Hallo";
      s = s + name;
      s = s + "!";
      return s;
    }
}
Sorgt für die Ausgabe:
Hallo Welt!
*/


/*
public class KontaktMitVar{
    public static String gruss(String name){
      String s = "<hnock>";
      s = s + s + s + name + "! ";
      s = s + s + s;
      return s;
    }
}
 sorgt für die dreifache Ausgabe:
 <hnock> <hnock> <hnock> Penny! 
 <hnock> <hnock> <hnock> Penny! 
 <hnock> <hnock> <hnock> Penny! 
*/

/*
public class KontaktmtIfElse{
  public static String gruss(String sprache, String name){
    String formel;
    if(sprache.equals("Deutsch")) {
      formel = "Hallo";
    } else{
      formel = "Hello";
    }
    return formel + " " + name + "!";
  }
}
Ausgabe:
Hallo Marther! oder Hello Marther!
*/

/*
public class KontaktmtIf{
  public static String gruss(String sprache, String name){
    String formel;
    if(sprache.equals("Deutsch")) {
      formel = "Hallo";
    }
    return formel + " " + name + "!";
  }
}
Ausgabe:
Nur "Hallo Marther!"
*/
/*
public class Mathe1 {
  public static int max(int a, int b) {
    if (a >= b){
      return a;
    } else {
      return b;
    }
  }
}
*/

public static String signum(int n) {
  if (n < 0) {
    return "negativ";
  } else 
}


public static String signum(int n) {
  if (n < 0) {
    return "negativ";
  } 
  if (n > 0) {
    return "positiv"
  } 
  return "neutral"
}

