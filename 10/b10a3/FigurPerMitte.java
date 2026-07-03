public abstract class FigurPerMitte extends Figur {
    private Punkt2D mitte;

    public FigurPerMitte(Punkt2D mitte) {
        this.mitte = new Punkt2D(mitte.x(), mitte.y());
    }

    public FigurPerMitte(FigurPerMitte andere) {
        this.mitte = new Punkt2D(andere.mitte.x(), andere.mitte.y());
    }

    @Override
    public final Punkt2D mitte() {
        return new Punkt2D(mitte.x(), mitte.y());
    }

    @Override
    public FigurPerMitte verschiebe(double dx, double dy) {
        mitte = new Punkt2D(mitte.x() + dx, mitte.y() + dy);
        return this;
    }
}