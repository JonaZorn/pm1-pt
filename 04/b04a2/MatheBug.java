package b04a2;
public class MatheBug {
  public static boolean istPrimzahl(int n) {
    if(n <= 1){
      return false;
    }
    int i = 2;
    while (i < n) {
      if (n % i == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static void primzahlenAusgabe(int n) {
    int i = 2;
    while (i <= n) {
      if (istPrimzahl(i)) {
        System.out.println(i);
      }
      ++i;
    }
  }
}
