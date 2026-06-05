public class RechteckXYPerEcke{
    private Punkt2D lu;
    private Punkt2D ro;

    public RechteckXYPerEcke(double xLinks, double xRechts, double yUnten, double yOben) {
        this.lu = new Punkt2D(xLinks, yUnten);
        this.ro = new Punkt2D(xRechts, yOben);
    }
    public RechteckXYPerEcke(Punkt2D p1, Punkt2D p2){
        double xLinks, xRechts, yUnten, yOben;
        if (p1.x() < p2.x()){
            xLinks = p1.x();
            xRechts = p2.x();
        } else {
            xLinks = p2.x();
            xRechts = p1.x();
        }
        if (p1.y() < p2.y()) {
            yUnten = p1.y();
            yOben = p2.y();
        } else {
            yUnten = p2.y();
            yOben = p1.y();
        }
        this.lu = new Punkt2D(xLinks, yUnten);
        this.ro = new Punkt2D(xRechts, yOben);
    }
    public RechteckXYPerEcke(RechteckXYPerEcke r) {
        this(r.lu, r.ro);
    }
    public double breite() {
        return ro.x() - lu.x();
    }
    public double tiefe() {
         return ro.y() - lu.y();
    }
    public boolean equals(RechteckXYPerEcke r){
        return lu.equals(r.lu) && ro.equals(r.ro);
    }

    public Punkt2D ecke(boolean rechts, boolean oben) {
        if(rechts && oben){
            return new Punkt2D(ro.x(), ro.y());
        } if(rechts && !oben){ 
            return new Punkt2D(ro.x(), lu.y());
        } if(!rechts && oben){ 
            return new Punkt2D(lu.x(), ro.y());
        }
        return new Punkt2D(lu.x(), lu.y());
    }
    public Punkt2D ecke(int n){
        if(n == 0){  
            return ecke(false, false);
        } if(n == 1){  
            return ecke(true, false);
        } if(n == 2){  
            return ecke(true, true);
        }
        return ecke(false, true);
    }
    public Punkt2D mitte() {
        return new Punkt2D((lu.x() + ro.x()) / 2,(lu.y() + ro.y()) / 2  );
    }
    public double durchmesser() {
        double a = breite();
        double b = tiefe();
        return Math.sqrt(a*a + b*b);
    }
    public double umfang() {
        return 2 * (breite() + tiefe());
    }
    public double flaeche() {
        return breite() * tiefe();
    }
    public RechteckXYPerEcke verschiebe(double x, double y) {
        lu = new Punkt2D(lu.x() + x, lu.y() + y);
        ro = new Punkt2D(ro.x() + x, ro.y() + y);
        return this;
    }
    public String toString() {
        return "[" + lu + "," + ro + "]";
}
}