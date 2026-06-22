public class Rational {
    private int zaehler;
    private int nenner;

    public Rational(){
        this(0);
    }
    public Rational(int z){
        this(z, 1);
    }
    public Rational(int z, int n){
    if (n == 0) {
        throw new ArithmeticException("ungueltiger Wert fuer Nenner: " + n);
    }
    if(n < 0){
        z = -z;
        n = -n;
    }
    int g = ggT(Math.abs(z), n);  // eigene Hilfsmethode
    zaehler = z / g;
    nenner = n / g;
}

// Hilfsmethode ggT in der Klasse ergänzen
private static int ggT(int a, int b){
    while (b != 0){
        int rest = a % b;
        a = b;
        b = rest;
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
    


    
    public static Rational parse(String s) {
    s = s.trim();

    int i = s.indexOf('/');

    if (i == -1) {
        throw new IllegalArgumentException("ungueltiges Format: " + s);
    }

    String zaehlerStr = s.substring(0, i).trim();
    String nennerStr  = s.substring(i + 1).trim();

    try {
        int z = Integer.parseInt(zaehlerStr);
        int n = Integer.parseInt(nennerStr);
        return new Rational(z, n); 
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("ungueltiges Format: " + s);
    }
}
    public String toString(){
        return zaehler + "/" + nenner;
    }
}
