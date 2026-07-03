public abstract class Figur {

    public Figur() {
    }

    public Figur(Figur andere) {
    }

    public abstract Punkt2D mitte();

    public abstract double durchmesser();

    public abstract double umfang();

    public abstract double flaeche();

    public abstract boolean istEnthalten(Punkt2D punkt);

    public abstract Figur verschiebe(double dx, double dy);

    @Override
    public abstract String toString();
}

class Punkt2D {
    private final double x;
    private final double y;

    public Punkt2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public boolean equals(Punkt2D p) {
        return x == p.x && y == p.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}