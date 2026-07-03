public final class Frau extends Mensch {
    private static int anzahl = 0;

    public Frau(String name, int alter, int groesse, int gewicht) {
        super(name, alter, groesse, gewicht);
        anzahl++;
    }

    public static int anzahl() {
        return anzahl;
    }

    @Override
    public String chromosomen() {
        return "XX";
    }

    @Override
    public int groesse() {
        return groesseTatsaechlich() - 5;
    }

    @Override
    public int gewicht() {
        return gewichtTatsaechlich();
    }

    @Override
    public int preisHaarschnitt() {
        return (int) Math.round(20 + 2.0 / 3 * alter());
    }
}