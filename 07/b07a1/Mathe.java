public class Mathe {
   /** public static int addLoop(int a, int b) {
        if(a > 0 & b > 0 | a < 0 & b > 0){
            while(b != 0){
                a++;
                b--;
            }
        } if(a < 0 & b < 0 | a > 0 & b < 0) {
            while (b != 0){
                a--;
                b++;
            }
        }
    return a;
    }



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
    }*/

    public static int mulLoop(int a, int b) {
        int i = 0;
        int c = a;
        int erg = 0;
    
        if(b > 0){
            while(i != c){
                c = a;
                if (a > 0) {
                    while (c != 0) {
                        erg++;
                        c--;
                    }
                } else{
                    while (c != 0) {
                        erg--;
                        c++;
                    }
                }
                i++;
            }
        } else {
            while(i != b){
                c = a;
                if(a > 0 ) {
                    while (c != 0){
                    erg--;
                    c--;
                    }
                } else{
                    while(c != 0) {
                        a++;
                        c++;
                    }
                } 
                i--;
            }
        }
    return erg; 
    }
}
