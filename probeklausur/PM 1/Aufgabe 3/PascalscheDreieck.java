public class PascalscheDreieck{
    public static int pascal(int n, int k) {
    return (k == 0 || k == n) ? 1 : pascal(n - 1, k - 1) + pascal(n - 1, k);
}

    public static void main(String[] args){
        System.out.println(pascal(4,2));
    }
}