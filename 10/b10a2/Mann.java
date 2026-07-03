public final class Mann extends Mensch {
    private static int anzahl = 0;

    public Mann(String name, int alter, int groesse, int gewicht) {
        super(name, alter, groesse, gewicht);
        anzahl++;
    }

    public static int anzahl() {
        return anzahl;
    }

    @Override
    public String chromosomen() {
        return "XY";
    }

    @Override
    public int groesse() {
        return groesseTatsaechlich();
    }

    @Override
    public int gewicht() {
        return gewichtTatsaechlich() + 5;
    }

    @Override
    public int preisHaarschnitt() {
        return (int) Math.round(10 + 1.0 / 4 * alter());
    }
}