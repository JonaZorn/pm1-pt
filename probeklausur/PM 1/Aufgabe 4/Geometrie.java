public class Geometrie {
    public static void main(String[] args) {
        System.out.println("Flaeche: " + flaecheQuadrat(-3.0));
    }
    public static double flaecheQuadrat(double a) {
        return flaecheRechteck(a, a);
    }
    public static double flaecheRechteck(double b, double h) throws NegLaengeException {
        if (b < 0.0 || h < 0.0 ) {
            throw new NegLaengeException();
        }
        return b * h;
    }
}