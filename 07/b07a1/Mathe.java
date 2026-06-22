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

    public static int subLoop(int a, int b) {
        while (b > 0) {
            --b;
            --a;
        }

        while (b < 0) {
            ++b;
            ++a;
        }
        return a;
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
    }

    public static int divLoop(int a, int b) {
        boolean p = (a < 0) == (b < 0); 
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        int e = 0;
        while(a >= b) {
            a = subLoop(a, b);
            e++;
        }
        return p ? e : -( e );
    }
    

    public static int modLoop(int a, int b) {
        boolean p = (a < 0) == (b < 0); 
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        int e = 0;
        while(a >= b) {
            a = subLoop(a, b);
        }
        return p ? a : -a;
    }

    public static int powLoop(int a, int b) {
        int c = 0;
        int e = 1;
        while( c < b ) {
            e = mulLoop( e, a );
            c++;
        }
        return (e <= 1 ? 0 : e);
    }
}
