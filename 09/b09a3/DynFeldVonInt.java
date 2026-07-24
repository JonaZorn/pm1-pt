public class DynFeldVonInt {
    private int[] f;

    public DynFeldVonInt(int laenge){
        if (laenge <= 0) throw new IllegalArgumentException("Laenge muss positiv sein");

        f = new int[laenge];
    }

    public int length(){
        return f.length;
    }

    public int get(int i){
        if (i < 0 || i >= f.length) throw new ArrayIndexOutOfBoundsException(i);

        return f[i];
    }

    public void set(int i, int v){
        if (i < 0 || i >= f.length) throw new ArrayIndexOutOfBoundsException(i);

        f[i] = v;
    }

    public void insert(int i, int k){
        if (i < 0 || i >= f.length) throw new ArrayIndexOutOfBoundsException(i);
        if (k <= 0) throw new IllegalArgumentException("k muss positiv sein");

        int[] n = new int[f.length + k];
        for (int j = 0; j < i; j++){
            n[j] = f[j];
        }
        for (int j = i; j < f.length; j++){
            n[j + k] = f[j];
        }
        f = n;
    }

    public void remove(int i, int k){
        if (i < 0 || i >= f.length) throw new ArrayIndexOutOfBoundsException(i);
        if (k <= 0) throw new IllegalArgumentException("k muss positiv sein");
        if (i + k > f.length) throw new IllegalArgumentException("nicht genug Elemente ab Position " + i);

        int[] n = new int[f.length - k];
        for (int j = 0; j < i; j++){
            n[j] = f[j];
        }
        for (int j = i + k; j < f.length; j++){
            n[j - k] = f[j];
        }
        f = n;
    }

    public boolean equals(DynFeldVonInt other){/*
        if (other == null) throw new NullPointerException();
        if (f.length != other.f.length) return false;
        for (int i = 0; i < f.length; i++){
            if (f[i] != other.f[i]) return false;
        }
        return true;*/
        return java.util.Arrays.equals(f, other.f)
    }

    public String toString(){/*
        String s = "[";
        for (int i = 0; i < f.length; i++){
            s += f[i];
            if (i + 1 < f.length) s += ",";
        }
        return s + "]";*/
        return java.util.Arrays.toString(f);
    }
}