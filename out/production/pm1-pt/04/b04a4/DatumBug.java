public class DatumBug {
  // Hinweis: ja, so wird teilweise in der Industrie programmiert...
  public static int jahr(int tage) {
    int jahr = 1980;
    while (tage >= 365) {
      boolean istSchaltjahr = (jahr % 4 == 0 & jahr % 100 != 0) | (jahr % 400 == 0);

      if (istSchaltjahr) {
        if (tage >= 366) {
          tage = tage - 366;
          jahr++;
        }
      } else {
        tage = tage - 365;
        jahr++;
      }
    }
    return jahr + 1;
  }
}