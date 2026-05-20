public class DatumBug {
  // Hinweis: ja, so wird teilweise in der Industrie programmiert...
  public static int jahr(int tage) {
    int jahr = 1980; // 01.01.1980 ist Tag 1
    while (tage > 365) {
      if (Datum.istSchaltjahr(jahr)) {
        if (tage > 366) {
          tage = tage - 366;
          jahr = jahr + 1;
        }
      } else {
        tage = tage - 365;
        jahr = jahr + 1;
      }
    }
    return jahr;
  }
}
