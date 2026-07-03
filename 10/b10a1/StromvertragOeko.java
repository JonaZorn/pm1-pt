public class StromvertragOeko extends Stromvertrag {
    private static int anzahl = 0;
    private static final int fr = 1200;     // Cent pro Monat
    private static final int pkws = 35;     // Cent pro kWh

    public StromvertragOeko(String name, int monat, int zaehler) {
        super(name, monat, zaehler);
        anzahl++;
    }

    @Override
    public int anzahl() {
        return anzahl;
    }

    @Override
    public int kostenFix(int monate) {
        if (monate < 0) {
            throw new IllegalArgumentException("Ungueltige Monatsanzahl");
        }
        return monate * fr;
    }

    @Override
    public int kostenVariabel(int monate, int kwh) {
        if (monate < 0 || kwh < 0) {
            throw new IllegalArgumentException("Ungueltige Argumente");
        }
        return kwh * pkws;
    }
}