public class Rational {
    private int zaehler;
    private int nenner;

    public Rational(){
        this(0);
    }
    public Rational(int z){
        this(zaehler, 1);
    }
    public Rational(int z, int n){
        if(n < 0){
            z = -z;
            n = -n;
        }
        int g = Mathe.ggT(Math.abs(z), n)
        zaehler = z / g;
        nenner = n / g;
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
        return new Rational(Math.abs(zaehler), nenner);
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
