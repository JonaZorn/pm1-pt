public final class RechteckXYPerMitteLaengen extends FigurPerMitte {
    private static final double EPSILON = 1e-9;

    private final double breite;
    private final double tiefe;

    public RechteckXYPerMitteLaengen(Punkt2D mitte, double breite, double tiefe) {
        super(mitte);
        if (breite < 0 || tiefe < 0) {
            throw new IllegalArgumentException("Ungueltige Ausdehnung");
        }
        this.breite = breite;
        this.tiefe = tiefe;
    }

    public RechteckXYPerMitteLaengen(RechteckXYPerMitteLaengen andere) {
        super(andere);
        this.breite = andere.breite;
        this.tiefe = andere.tiefe;
    }

    public double breite() {
        return breite;
    }

    public double tiefe() {
        return tiefe;
    }

    public Punkt2D ecke(boolean istRechts, boolean istOben) {
        return mitte().verschiebe((istRechts ? breite : -breite ) / 2,
                                  (istOben ? tiefe : -tiefe) / 2);
    }

    @Override
    public double durchmesser() {
        return Math.sqrt(breite * breite + tiefe * tiefe);
    }

    @Override
    public double umfang() {
        return 2 * (breite + tiefe);
    }

    @Override
    public double flaeche() {
        return breite * tiefe;
    }

    @Override
    public boolean istEnthalten(Punkt2D punkt) {
        double dx = Math.abs(punkt.x() - mitte().x());
        double dy = Math.abs(punkt.y() - mitte().y());
        return dx <= breite / 2 && dy <= tiefe / 2;
    }

    private static boolean nahezuGleich(double a, double b) {
        return Math.abs(a - b) < EPSILON;
    }

    @Override
    public boolean equals(Object andere) {
        if (this == andere) {
            return true;
        }
        if (!(andere instanceof RechteckXYPerMitteLaengen)) {
            return false;
        }
        RechteckXYPerMitteLaengen r = (RechteckXYPerMitteLaengen) andere;
        return nahezuGleich(breite, r.breite)
                && nahezuGleich(tiefe, r.tiefe)
                && nahezuGleich(mitte().x(), r.mitte().x())
                && nahezuGleich(mitte().y(), r.mitte().y());
    }

    @Override
    public String toString() {
        return "[" + ecke(false, false) + "," + ecke(true, true) + "]";
    }
}