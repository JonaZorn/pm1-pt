public class Mathe{
    public static int fakRek(int n) {
        if (n == 1) {
            return 1;
        } else{
        return n * fakRek(n-1);
        }
    }
    public static int fakLoop(int n) {
        if(n > 1){
            int i = 1;
            int p1 = 1;
            int p2 = 1;
            while (i <= n) {
                p1 = p1 * p2;
                p2 = p2 + 1;
                i = i + 1;
            }
        return p1;
        } 
        return 1;
    }

}