public class Feld {
    public static int[] umkehren(int[] f){
        //if (f == null) throw new NullPointerException();

        int[] e = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            e[i] = f[f.length - 1 - i];
        }
        return e;
    }
    public static void umkehrenInPlace(int[] f){
        //if (f == null) throw new NullPointerException();
        
        for (int i = 0; i < f.length / 2; i++) {
            int a = f[i];
            f[i] = f[f.length - 1 - i];
            f[f.length - 1 - i] = a;
        }
    }
}
