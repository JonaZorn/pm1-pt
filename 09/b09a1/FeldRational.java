public class FeldRational {
    static class Rational {
        private int zaehler;
        private int nenner;

        public Rational(int z, int n){
            if(n < 0){
                z = -z;
                n = -n;
            }
            int g = ggT(Math.abs(z), n);
            zaehler = z / g;
            nenner = n / g;
        }
        private static int ggT(int a, int b){
            while (b != 0){ int rest = a % b; a = b; b = rest; }
            return a;
        }
        public boolean equals(Rational r){ 
            return zaehler == r.zaehler && nenner == r.nenner;
        }
        public boolean istKleiner(Rational r){
            return zaehler * r.nenner < r.zaehler * nenner;
        }
        public String toString(){
            return zaehler + "/" + nenner;
        }
    }


    public static boolean istHomogen(Rational[] f){
        if (f == null) throw new NullPointerException();
        for (int i = 0; i + 1 < f.length; i++) {
            if(!f[i].equals(f[i + 1])) return false;
        }
        return true;
    }
    public static boolean istSortiert(Rational[] f){
        if (f == null) throw new NullPointerException();
        for (int i = 0; i + 1 < f.length; i++) {
            if(f[i + 1].istKleiner(f[i])) return false;
        }
        return true;
    }
    public static int maxPos(Rational[] f){
        if (f == null) throw new NullPointerException();
        if (f.length == 0) throw new IllegalArgumentException("Feld ist leer");
        int p = 0;
        for (int i = 1; i < f.length; i++) {
            if(f[p].istKleiner(f[i])) p = i;
        }
        return p;
    }
    public static Rational maxElement(Rational[] f){
        if (f == null) throw new NullPointerException();
        if (f.length == 0) throw new IllegalArgumentException("Feld ist leer");
        return f[maxPos(f)];
    }
    public static Rational[] max(Rational[] f1, Rational[] f2){
        if (f1 == null || f2 == null) throw new NullPointerException();
        if (f1.length != f2.length) throw new IllegalArgumentException("Felder haben unterschiedliche Längen");
        Rational[] e = new Rational[f1.length];
        for (int i = 0; i < f1.length; i++) {
            if(f2[i].istKleiner(f1[i])){
                e[i] = f1[i];
            } else {
                e[i] = f2[i];
            }
        }
        return e;
    }
}