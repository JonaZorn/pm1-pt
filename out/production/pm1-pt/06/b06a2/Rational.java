public class Rational {
    private int zaehler;
    private int nenner;

    public Rational(){
        this(0, 1);
    }
    public Rational(int zaehler){
        this(zaehler, 1);
    }
    public Rational(int zaehler, int nenner){
        if(nenner < 0){
            zaehler = -zaehler;
            nenner = -nenner;
        }
        int g = ggT(zaehler, nenner);
        this.zaehler = zaehler / g;
        this.nenner = nenner / g;
    }
    private static int ggT(int a, int b){
        if (a < 0){
            a = -a;
        }
        while (b > 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    public Rational(Rational r){
        this(r.zaehler, r.nenner);
    }
    public int zaehler() {
    return zaehler;
    }
    public int nenner() {
    return nenner;
    }
    public boolean equals(Rational r){
        return zaehler == r.zaehler && nenner == r.nenner;
    }
    public boolean istKleiner(Rational r){
        return zaehler * r.nenner < r.zaehler * nenner;
    }
    public Rational abs(){
        return new Rational(zaehler < 0 ? - zaehler : zaehler, nenner);
    }
    public Rational rez(){
        return new Rational(nenner, zaehler);
    }
    public Rational add(Rational r) {
        return new Rational(zaehler * r.nenner + r.zaehler * nenner, nenner * r.nenner);
    }
    public Rational sub(Rational r) {
        return new Rational(zaehler * r.nenner - r.zaehler * nenner, nenner * r.nenner);
    }
    public Rational mul(Rational r) {
        return new Rational(zaehler * r.zaehler, nenner * r.nenner);
    }
    public Rational div(Rational r) {
        return new Rational(zaehler * r.nenner, nenner * r.zaehler);
    }

    public String toString(){
        return zaehler + "/" + nenner;
    }
}
