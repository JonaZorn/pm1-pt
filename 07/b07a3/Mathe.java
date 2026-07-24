public class Mathe {
    public static int addLoop(int a, int b) {
        while (a > 0) {
            ++b;
            --a;
        }

        while (a < 0) {
            --b;
            ++a;
        }
        return b;
    }
    public static int mulLoop(int a, int b) {
        boolean p = ( a < 0 ) == ( b < 0 );
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        int c = 0;
        int e = 0;
        while( c < b ) {
            e = addLoop( e, a );
            ++c;
        }
        return p ? e : -( e );
    }/*
        public static int powLoop(int a, int b) {
        int e = 1;
        while(b > 0) {
            if (b % 2 == 1) {
                e = mulLoop( e, a );
            }
            a = mulLoop( a, a );
            b = b / 2;
        }
        return (e <= 1 ? 0 : e);
    }*/

    public static int powRek(int a, int b) {
        if (b == 0){
            return 1;
        }
        int qu = mulLoop(a, a);
        if (b % 2 == 0) {
            return powRek(qu, b / 2);
        }
        return mulLoop(a, powRek(qu, b / 2));
    }

    //lösung
    public static int powRek(int a, int b) {
        return powRek(a, b, 1);
    }
    private static int powRek(int a, int b, int c) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            return powRek(a * a, b / 2, c);
        }
        return powRek(a * a, b / 2,c * a);
    }
}
