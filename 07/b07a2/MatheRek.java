public class MatheRek {
    public static int addRek(int a, int b) {
        if (a == 0){
            return b;
        }
        return addRek(--a, ++b);
    }

    public static int subRek(int a, int b) {
        if (b == 0){
            return a;
        }
        return subRek(--a, --b);
    }

    public static int mulRek(int a, int b) {
        if (b < 0){
            return mulRekHelp(-a, -b);
        }
        return mulRekHelp(a, b);
    }    
    private static int mulRekHelp(int a, int b) {
        if (b == 0){
            return 0;
        }
        return addRek(a, mulRekHelp(a, --b));
    }

    public static int divRek(int a, int b) {
        if (a < b){
            return 0;
        }
        return addRek(1, divRek(subRek(a, b), b));
    }

    public static int modRek(int a, int b) {
        if (a < b){
            return a;
        }
        return modRek(subRek(a, b), b);
    }

    public static int powRek(int a, int b) {
        if (b == 0){
            return 1;
        }
        return mulRek(a, powRek(a, --b));
    }
}
