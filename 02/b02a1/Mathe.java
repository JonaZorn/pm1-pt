public class Mathe{
    public static int abs(int n) {
        if (n < 0) {
            n  = -(n);
            return (n);
        } else{
        return n;
        }
    }
    public static int max(int a, int b,int c) {
        int max = a;
        if (b > max) {
            max  = b;
        } 
        if(c > max){
            max = c;
        }
        return max;
    }

}