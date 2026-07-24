public class Matritzen{
    public static int[][] spiegele(int[][] a){
        int n = a.length;
        int[][] e = new int[n][n];
        for(int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j){
                e[i][j] = a[n - 1 - j][n - 1 - i];
            }
        }
    return e; 
    }
        public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] r = spiegele(a);

        for (int i = 0; i < r.length; ++i) {
            for (int j = 0; j < r[i].length; ++j) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}