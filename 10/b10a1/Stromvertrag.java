public class Stromvertrag {
    private static int anzahl = 0;
    private static final int fr = 1000; 
    private static final int pkws = 30;

    private final int nummer;
    private final String name;
    private int monat;
    private int zaehler;

    public Stromvertrag(String name, int monat, int zaehler) {
        if (monat <= 0 || zaehler < 0) {
            throw new IllegalArgumentException("Ungueltige Argumente");
        }
        this.name = name;
        this.monat = monat;
        this.zaehler = zaehler;
        anzahl++;
        this.nummer = anzahl;
    }

    public int anzahl() {
        return anzahl;
    }

    public int nummer() {
        return nummer;
    }

    public int monat() {
        return monat;
    }

    public int zaehler() {
        return zaehler;
    }

    public int kostenFix(int monate) {
        if (monate < 0) {
            throw new IllegalArgumentException("Ungueltige Monatsanzahl");
        }
        return monate * fr;
    }

    public int kostenVariabel(int monate, int kwh) {
        if (monate < 0 || kwh < 0) {
            throw new IllegalArgumentException("Ungueltige Argumente");
        }
        return kwh * pkws;
    }

    public int rechnung(int aktuellerMonat, int aktuellerZaehler) {
        if (aktuellerMonat < monat || aktuellerZaehler < zaehler) {
            throw new IllegalArgumentException("Ungueltige Argumente");
        }
        int monate = aktuellerMonat - monat;
        int kwh = aktuellerZaehler - zaehler;
        int kosten = kostenFix(monate) + kostenVariabel(monate, kwh);
        monat = aktuellerMonat;
        zaehler = aktuellerZaehler;
        return kosten;
    }
}