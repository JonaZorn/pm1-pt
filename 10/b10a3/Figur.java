public abstract class Figur {
    public Figur() {}
    public Figur(Figur f) {}
    public abstract Punkt2D mitte();
    public abstract double durchmesser();
    public abstract double umfang();
    public abstract double flaeche();
    public abstract boolean istEnthalten(Punkt2D p);
    public abstract Figur verschiebe(double dx, double dy);
    public abstract String toString();
}
