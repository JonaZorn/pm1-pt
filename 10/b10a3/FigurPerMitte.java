public abstract class FigurPerMitte extends Figur {
    private Punkt2D mitte;
    public FigurPerMitte(Punkt2D mitte) {
        this.mitte = new Punkt2D(mitte);
    }

    public FigurPerMitte(FigurPerMitte m) {
        super (m)
        this.mitte(m.mitte);
    }

    public final Punkt2D mitte() {
        return new Punkt2D(mitte);
    }

    @Override
    public FigurPerMitte verschiebe(double dx, double dy) {
        mitte.verschiebe(dx, dy);
        mitte = new Punkt2D(mitte.x() + dx, mitte.y() + dy);
        return this;
    }
}