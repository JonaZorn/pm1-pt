public class Zeichenkette{
    public static String wiederhole(int n){
    String t = "";
    String s = "";
    String r = "";
    int i = 0;
    if(n == 0){
        return "";
    }   while (i < n - 1) {
            s = "Humba";
            t = ", ";
            r = r + s + t;
            i = i + 1;
            }
    r = r + s;
    return r;
    }

    public static String wiederhole(int n, String s, char t){
    String r = "";
    int i = 0;
    if(n == 0){
        return "";
    }   while (i < n - 1) {
            r = r + s + t;
            i = i + 1;
            }
    r = r + s;
    return r;
    }
}