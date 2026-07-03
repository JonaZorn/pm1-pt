public abstract class Mensch {
    private static int anzahl = 0;
    private static final int VOLLJAEHRIGKEITSALTER = 18;

    private final String name;
    private int alter;
    private int groesseTatsaechlich;
    private int gewichtTatsaechlich;

    protected Mensch(String name, int alter, int groesse, int gewicht) {
        this.name = name;
        this.alter = alter;
        this.groesseTatsaechlich = groesse;
        this.gewichtTatsaechlich = gewicht;
        anzahl++;
    }

    public static int anzahl() {
        return anzahl;
    }

    public final String name() {
        return name;
    }

    public abstract String chromosomen();

    public final int alter() {
        return alter;
    }

    public static int volljaehrigkeitsAlter() {
        return VOLLJAEHRIGKEITSALTER;
    }

    public final boolean istVolljaehrig() {
        return alter >= volljaehrigkeitsAlter();
    }

    public abstract int gewicht();

    public abstract int groesse();

    public final void setAlter(int alter) {
        this.alter = alter;
    }

    public final void setGroesse(int groesse) {
        this.groesseTatsaechlich = groesse;
    }

    public final void setGewicht(int gewicht) {
        this.gewichtTatsaechlich = gewicht;
    }

    protected final int groesseTatsaechlich() {
        return groesseTatsaechlich;
    }

    protected final int gewichtTatsaechlich() {
        return gewichtTatsaechlich;
    }

    public abstract int preisHaarschnitt();

    @Override
    public String toString() {
        return name() + " " + chromosomen() + " " + alter() + " " + istVolljaehrig()
                + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
    }
}